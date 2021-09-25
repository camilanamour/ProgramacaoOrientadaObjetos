package aula07.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneLayout extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane painel = new BorderPane();
//		topo, direita, centro, esquerda, baixo ==> 1 componente em cada região
		Scene cenario = new Scene(painel, 600.0, 400.0);
		
		painel.setTop(new Label("Top"));
		painel.setRight(new Label("Right"));
		painel.setCenter(new Label("Center"));
		painel.setLeft(new Label("Left"));
		painel.setBottom(new Label("Bottom"));
		
		stage.setScene(cenario);
		stage.setTitle("BorderPane");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(BorderPaneLayout.class, args);
	}

}
