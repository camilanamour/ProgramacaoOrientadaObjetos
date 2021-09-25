package aula07.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PainelPrimeiraJanela extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
        Scene cenario = new Scene(painel, 800.0, 600.0); 	// add o painel no cenário
        
        Label lblHelloWorld = new Label("Hello World");
        lblHelloWorld.relocate(380.0, 250.0);
        Button btnOk = new Button("Ok");
        btnOk.relocate(400.0, 300.0);
        
        // painel.getChildren().add(btnOk);
        painel.getChildren().addAll(lblHelloWorld, btnOk);	// add componentes no Painel
        
        stage.setScene(cenario); 							// add o cenário no palco
		stage.setTitle("Primeira janela");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(PainelPrimeiraJanela.class, args);
	}

}
