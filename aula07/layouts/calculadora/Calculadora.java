package aula07.layouts.calculadora;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculadora extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane layoutPrincipal = new BorderPane();
		FlowPane layoutTop = new FlowPane();
		GridPane layoutCentro = new GridPane();
		
		Scene cenario = new Scene(layoutPrincipal, 300.0, 400.0);
		
		TextField txtVisor = new TextField();
		txtVisor.setPrefWidth(200.0);
		txtVisor.setPrefHeight(45.0);
		Button btnLimpar = new Button("CE");
		layoutTop.setHgap(20.0);
		layoutTop.setVgap(20.0);
		layoutTop.setAlignment(Pos.CENTER);
		layoutTop.getChildren().addAll(txtVisor, btnLimpar);

		layoutCentro.setAlignment(Pos.CENTER);
		layoutCentro.setHgap(10.0);
		layoutCentro.setVgap(10.0);
		
//		Button btn1 = new Button("1");
//		btn1.setPrefSize(60.0, 70.0);
//		layoutCentro.add(btn1, 0, 0);
		
		String[] nomesBotoes = {"1", "2", "3", "+", "4", "5", "6", "-",
				"7", "8", "9", "*", ".", "0", "=", "/"};
		for(int i=0; i<nomesBotoes.length; i++){ 
			int lin=i/4;
			int col=i%4;
			Button btn = new Button(nomesBotoes[i]);
			btn.setPrefSize(60.0, 70.0);
			layoutCentro.add(btn, col, lin);
		}
		
		layoutPrincipal.setTop(layoutTop);
		layoutPrincipal.setCenter(layoutCentro);
		
		stage.setScene(cenario);
		stage.setTitle("Calculadora");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(Calculadora.class, args);
	}

}
