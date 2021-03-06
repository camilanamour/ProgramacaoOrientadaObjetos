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
import javafx.scene.control.TableCell;
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
	private Button btnAlterar = new Button("Alterar");

	private PetController control = new PetController(); // composi??o

	private TableView<Pet> table = new TableView<>();
	
	private void criarTabela() {
        TableColumn<Pet, Long> col1 = new TableColumn<>("Id");
        col1.setCellValueFactory(
                new PropertyValueFactory<Pet, Long>("id")
        );

        TableColumn<Pet, String> col2 = new TableColumn<>("Nome");
        col2.setCellValueFactory(
                new PropertyValueFactory<Pet, String>("nome")
        );

        TableColumn<Pet, String> col3 = new TableColumn<>("Ra?a");
        col3.setCellValueFactory(
                new PropertyValueFactory<Pet, String>("raca")
        );

        TableColumn<Pet, Double> col4 = new TableColumn<>("Peso");
        col4.setCellValueFactory(
                new PropertyValueFactory<Pet, Double>("peso")
        );

        TableColumn<Pet, String> col5 = new TableColumn<>("Nascimento");
        col5.setCellValueFactory( (item) -> {
                    LocalDate d = item.getValue().getDataNascimento();
                    return new ReadOnlyStringWrapper(d.format(fmt));
                }
        );

        TableColumn<Pet, String> col6 = new TableColumn<>("A??es");
        col6.setCellFactory( (tbcol) -> {
            Button btnRemover = new Button("Remover");
            TableCell<Pet, String> tcell = new TableCell<Pet, String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        btnRemover.setOnAction( (e) -> {
                            Pet p = getTableView().getItems().get(getIndex());
                            control.remover(p.getId());
                        });
                        setGraphic(btnRemover);
                        setText(null);
                    }
                }
            };
            return tcell;
            }
        );

        table.getSelectionModel().selectedItemProperty().addListener( (obs, old, novo) -> {
                    control.fromEntity(novo);
                }
        );

        table.getColumns().addAll(col1, col2, col3, col4, col5, col6);
        table.setItems(control.getLista());
    }

    public void start(Stage stage) {
        BorderPane panPrincipal = new BorderPane();
        GridPane panCampos = new GridPane();
        Scene scn = new Scene(panPrincipal, 600, 400);

        panPrincipal.setTop(panCampos);
        panPrincipal.setCenter(table);

        criarTabela();

        txtId.setEditable(false);

        Bindings.bindBidirectional(txtId.textProperty(), control.id, new NumberStringConverter());
        Bindings.bindBidirectional(txtNome.textProperty(), control.nome);
        Bindings.bindBidirectional(txtRaca.textProperty(), control.raca);
        Bindings.bindBidirectional(txtPeso.textProperty(), control.peso, new NumberStringConverter());
        Bindings.bindBidirectional(txtDataNascimento.textProperty(), control.nascimento, new LocalDateStringConverter());

        panCampos.add(new Label("Id:"), 0, 0);
        panCampos.add(txtId, 1, 0);
        panCampos.add(new Label("Nome:"), 0, 1);
        panCampos.add(txtNome, 1, 1);
        panCampos.add(new Label("Ra?a:"), 0, 2);
        panCampos.add(txtRaca, 1, 2);
        panCampos.add(new Label("Peso:"), 0, 3);
        panCampos.add(txtPeso, 1, 3);
        panCampos.add(new Label("Nascimento:"), 0, 4);
        panCampos.add(txtDataNascimento, 1, 4);

        panCampos.add(btnAdicionar, 0, 5);
        panCampos.add(btnSalvar, 1, 5);
        panCampos.add(btnAlterar, 2, 5);
        panCampos.add(btnPesquisar, 3, 5);


        btnAdicionar.setOnAction((e) -> {
            control.adicionar();
        });

        btnPesquisar.setOnAction( (e) -> {
            control.pesquisar();
        });

        btnSalvar.setOnAction( (e) -> {
            control.salvar();
            new Alert(Alert.AlertType.INFORMATION, "Pet salvo com sucesso").showAndWait();
        });
        
        btnAlterar.setOnAction( (e) -> {
            control.alterar();
        });

        stage.setScene(scn);
        stage.setTitle("Gest?o de Pets");
        stage.show();
    }


	public static void main(String[] args) {
		Application.launch(PetBoundary.class, args);
	}

}
