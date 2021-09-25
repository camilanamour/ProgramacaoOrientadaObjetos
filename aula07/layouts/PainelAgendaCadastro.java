package aula07.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PainelAgendaCadastro extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Pane painel = new Pane();			// não reponsivo
		Scene cenario = new Scene(painel, 280.0, 300.0);
		
		Label lblId = new Label("Id:");
		lblId.relocate(20, 20);				// realocar
		lblId.setPrefWidth(350.0);			// preferência de largura
		
		Label lblNome = new Label("Nome:");
		lblNome.relocate(20, 100);
		lblNome.setPrefWidth(350.0);
		
		Label lblTelefone = new Label("Telefone:");
		lblTelefone.relocate(20, 180);
		lblTelefone.setPrefWidth(350.0);
		
		TextField txtId = new TextField();
		txtId.resizeRelocate(100, 20, 450, 50); 	// realocar tamanho e posição
		
		TextField txtNome = new TextField();
		txtNome.resizeRelocate(100, 100, 450, 50);
		
		TextField txtTelefone = new TextField();
		txtTelefone.resizeRelocate(100, 180, 450, 50);
		
		Button btnSalvar = new Button("Salvar");
		btnSalvar.relocate(20, 250);
		
		Button btnPesquisar = new Button("Pesquisar");
		btnPesquisar.relocate(80, 250);
		
		painel.getChildren().addAll(lblId, lblNome, lblTelefone, 
				txtId, txtNome, txtTelefone, btnSalvar, btnPesquisar);
		
		stage.setScene(cenario);
		stage.setTitle("Agenda de Contatos");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(PainelAgendaCadastro.class, args);
	}

}
