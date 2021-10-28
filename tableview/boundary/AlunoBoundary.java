package boundary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import control.AlunoController;
import entity.Aluno;
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

public class AlunoBoundary extends Application{
	private TextField txtId = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtDataNascimento = new TextField();
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pequisar");
	
	private AlunoController control = new AlunoController();
	
	private TableView<Aluno> tabela = new TableView<>();
	
	private void criaTabela(){
		TableColumn<Aluno, Long> colId = new TableColumn<>("Id");
		colId.setCellValueFactory(
				new PropertyValueFactory<Aluno, Long>("id")
		);
		
		TableColumn<Aluno, String> colRa = new TableColumn<>("RA");
		colRa.setCellValueFactory(
				new PropertyValueFactory<Aluno, String>("ra")
		);
		
		TableColumn<Aluno, String> colNome = new TableColumn<>("Nome");
		colNome.setCellValueFactory(
				new PropertyValueFactory<Aluno, String>("nome")
		);
		
		TableColumn<Aluno, String> colNasc = new TableColumn<>("Nascimento");
        colNasc.setCellValueFactory( (item) -> {
                    LocalDate d = item.getValue().getNascimento();
                    return new ReadOnlyStringWrapper(d.format(fmt));
                }
        );
		
		tabela.getColumns().addAll(colId, colRa, colNome, colNasc);
		tabela.setItems(control.getLista());
	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane panPrincipal = new BorderPane();
		GridPane panCampos = new GridPane();
		
		panPrincipal.setTop(panCampos);
		panPrincipal.setCenter(tabela);
		criaTabela();
		
		Bindings.bindBidirectional(txtId.textProperty(), control.id, 
				new NumberStringConverter());
		Bindings.bindBidirectional(txtRa.textProperty(), control.ra);
        Bindings.bindBidirectional(txtNome.textProperty(), control.nome);
        Bindings.bindBidirectional(txtDataNascimento.textProperty(), 
        		control.nascimento, new LocalDateStringConverter());
		
		panCampos.add(new Label("ID:"), 0, 0);
		panCampos.add(txtId, 1, 0);
		panCampos.add(new Label("RA:"), 0, 1);
		panCampos.add(txtRa, 1, 1);
		panCampos.add(new Label("Nome:"), 0, 2);
		panCampos.add(txtNome, 1, 2);
		panCampos.add(new Label("Nascimento:"), 0, 3);
		panCampos.add(txtDataNascimento, 1, 3);
		
		panCampos.add(btnAdicionar, 0, 4);
		panCampos.add(btnPesquisar, 1, 4);
		
		btnAdicionar.setOnAction((e) -> {
			control.adicionar();
			new Alert(Alert.AlertType.INFORMATION, 
					"Aluno adicionado com sucesso!").showAndWait();
		});
		
		btnPesquisar.setOnAction((e) -> {
			control.pesquisar();
		});
		
		Scene scn = new Scene(panPrincipal, 400, 600);
		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class, args);
	}
}
