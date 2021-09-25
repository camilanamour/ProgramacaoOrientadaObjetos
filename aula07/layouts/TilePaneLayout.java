package aula07.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneLayout extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		TilePane painel = new TilePane();
//		reponsivo ==> quantas colunas, acaba vai para próxima linha
		
		painel.setPrefColumns(3);
		painel.setHgap(20.0); // distância horizontal
		painel.setVgap(20.0); // distância vertical

		Scene cenario = new Scene(painel, 800.0, 300.0);

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

		painel.getChildren().addAll(lblId, txtId, lblNome, txtNome, lblTelefone, txtTelefone, btnSalvar, btnPesquisar);

		stage.setScene(cenario);
		stage.setTitle("TilePane");
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(TilePaneLayout.class, args);
	}
}
