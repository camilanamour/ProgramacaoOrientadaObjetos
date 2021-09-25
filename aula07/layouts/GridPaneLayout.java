package aula07.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayout extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		GridPane painel = new GridPane(); 
//		Reponsivo ==> colunas e linhas

		Scene cenario = new Scene(painel, 500.0, 200.0);

		Label lblId = new Label("Id:");
		lblId.setPrefWidth(350.0);
		Label lblNome = new Label("Nome:");
		lblNome.setPrefWidth(350.0);
		Label lblTelefone = new Label("Telefone:");
		lblTelefone.setPrefWidth(350.0);

		TextField txtId = new TextField();
		TextField txtNome = new TextField();
		TextField txtTelefone = new TextField();

		Button btnSalvar = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");

		painel.add(lblId, 0, 0);
		painel.add(txtId, 1, 0);
		painel.add(lblNome, 0, 1);
		painel.add(txtNome, 1, 1);
		painel.add(lblTelefone, 0, 2);
		painel.add(txtTelefone, 1, 2);
		painel.add(btnSalvar, 0, 3);
		painel.add(btnPesquisar, 1, 3);
		
		stage.setScene(cenario);
		stage.setTitle("GridPane");
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(GridPaneLayout.class, args);
	}

}
