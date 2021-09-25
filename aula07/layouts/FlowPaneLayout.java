package aula07.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneLayout extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FlowPane painel = new FlowPane(); 
//		Reponsivo ==> esquerda para a direta de cima para baixo
		
		painel.setHgap(20.0); // distância horizontal
		painel.setVgap(20.0); // distância vertical

		Scene cenario = new Scene(painel, 200.0, 300.0);

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
		stage.setTitle("FlowPane");
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(FlowPaneLayout.class, args);
	}
}
