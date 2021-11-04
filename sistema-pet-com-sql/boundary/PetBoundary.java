package boundary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import control.PetController;
import entity.Pet;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

public class PetBoundary extends Application {
	
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtRaca = new TextField();
	private TextField txtPeso = new TextField();
	private TextField txtDataNascimento = new TextField();
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Button btnAdicionar = new Button("Adicionar");
	private Button btnSalvar = new Button("Salvar");
	private Button btnPesquisar = new Button("Pequisar");

	private PetController control = new PetController(); // composição

	private TableView<Pet> table = new TableView<>();
	
	private void criarTabela() {
//		Cria colunas e alimenta as linhas
        TableColumn<Pet, Long> col1 = new TableColumn<>("Id");
        col1.setCellValueFactory(
                new PropertyValueFactory<Pet, Long>("id")
        );

        TableColumn<Pet, String> col2 = new TableColumn<>("Nome");
        col2.setCellValueFactory(
                new PropertyValueFactory<Pet, String>("nome")
        );

        TableColumn<Pet, String> col3 = new TableColumn<>("Raça");
        col3.setCellValueFactory(
                new PropertyValueFactory<Pet, String>("raca")
        );

        TableColumn<Pet, Double> col4 = new TableColumn<>("Peso");
        col4.setCellValueFactory(
                new PropertyValueFactory<Pet, Double>("peso")
        );
        
        TableColumn<Pet, String> col5 = new TableColumn<>("Nascimento");
        col5.setCellValueFactory((item) -> {
        	LocalDate d = item.getValue().getDataNascimento();
//        	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        	String s = d.format(fmt);
        	return new ReadOnlyStringWrapper(s); 
        });
        
//      Seleciona preenche os campos
        table.getSelectionModel().selectedItemProperty().addListener((obs, old, novo) -> {
        	control.fromEntity(novo);
        });

        table.getColumns().addAll(col1, col2, col3, col4, col5);
        table.setItems(control.getLista());
    }
	
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane panPrincipal = new BorderPane();
		GridPane panCampos = new GridPane();
		Scene scn = new Scene(panPrincipal, 400, 600);
		
		panPrincipal.setTop(panCampos);
		panPrincipal.setCenter(table);
		criarTabela();
		
		txtId.setEditable(false);
//		Adicionar == 0; Salvar > 0
//		txtId.textProperty().addListener((obs, old, novo) -> {
//			if("".trim().equals(novo) || "0".equals(novo)){
//				btnAdicionar.setVisible(true);
//				btnSalvar.setVisible(false);
//			} else {
//				btnAdicionar.setVisible(false);
//				btnSalvar.setVisible(true);
//			}
//		});
		
		
		Bindings.bindBidirectional(txtId.textProperty(), control.id, 
				new NumberStringConverter());
        Bindings.bindBidirectional(txtNome.textProperty(), control.nome);
        Bindings.bindBidirectional(txtRaca.textProperty(), control.raca);
        Bindings.bindBidirectional(txtPeso.textProperty(), control.peso, 
        		new NumberStringConverter());
        Bindings.bindBidirectional(txtDataNascimento.textProperty(), 
        		control.nascimento, new LocalDateStringConverter());

		panCampos.add(new Label("Id:"), 0, 0);
		panCampos.add(txtId, 1, 0);
		panCampos.add(new Label("Nome:"), 0, 1);
		panCampos.add(txtNome, 1, 1);
		panCampos.add(new Label("Raça:"), 0, 2);
		panCampos.add(txtRaca, 1, 2);
		panCampos.add(new Label("Peso:"), 0, 3);
		panCampos.add(txtPeso, 1, 3);
		panCampos.add(new Label("Nascimento:"), 0, 4);
		panCampos.add(txtDataNascimento, 1, 4);
        
		panCampos.add(btnAdicionar, 0, 5);
		panCampos.add(btnSalvar, 1, 5);
		panCampos.add(btnPesquisar, 2, 5);
		
		btnAdicionar.setOnAction((e) -> {
			control.adicionar();
		});
		
		btnSalvar.setOnAction((e) -> {
			control.alterar();
			new Alert(Alert.AlertType.INFORMATION, 
					"Pet salvo com sucesso!").showAndWait();
		
		});

		btnPesquisar.setOnAction((e) -> {
			control.pesquisar();
		});

		stage.setScene(scn);
		stage.setTitle("Gestão Pets");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(PetBoundary.class, args);
	}

}
