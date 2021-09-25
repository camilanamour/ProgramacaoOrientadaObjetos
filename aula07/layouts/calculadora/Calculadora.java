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
		
		Button btn1 = new Button("1");
		btn1.setPrefSize(60.0, 70.0);
		
		Button btn2 = new Button("2");
		btn2.setPrefSize(60.0, 70.0);
		
		Button btn3 = new Button("3");
		btn3.setPrefSize(60.0, 70.0);
		
		Button btn4 = new Button("4");
		btn4.setPrefSize(60.0, 70.0);
		
		Button btn5 = new Button("5");
		btn5.setPrefSize(60.0, 70.0);
		
		Button btn6 = new Button("6");
		btn6.setPrefSize(60.0, 70.0);
		
		Button btn7 = new Button("7");
		btn7.setPrefSize(60.0, 70.0);
		
		Button btn8 = new Button("8");
		btn8.setPrefSize(60.0, 70.0);
		
		Button btn9 = new Button("9");
		btn9.setPrefSize(60.0, 70.0);
		
		Button btn0 = new Button("0");
		btn0.setPrefSize(60.0, 70.0);
		
		Button btnSomar = new Button("+");
		btnSomar.setPrefSize(60.0, 70.0);
		
		Button btnSubtrair = new Button("-");
		btnSubtrair.setPrefSize(60.0, 70.0);
		
		Button btnMultiplicar = new Button("*");
		btnMultiplicar.setPrefSize(60.0, 70.0);
		
		Button btnDividir = new Button("/");
		btnDividir.setPrefSize(60.0, 70.0);
		
		Button btnPonto = new Button(".");
		btnPonto.setPrefSize(60.0, 70.0);
		
		Button btnIgual = new Button("=");
		btnIgual.setPrefSize(60.0, 70.0);
		
		layoutCentro.setAlignment(Pos.CENTER);
		layoutCentro.setHgap(10.0);
		layoutCentro.setVgap(10.0);
		
		layoutCentro.add(btn1, 0, 0);
		layoutCentro.add(btn2, 1, 0);
		layoutCentro.add(btn3, 2, 0);
		layoutCentro.add(btnSomar, 3, 0);
		
		layoutCentro.add(btn4, 0, 1);
		layoutCentro.add(btn5, 1, 1);
		layoutCentro.add(btn6, 2, 1);
		layoutCentro.add(btnSubtrair, 3, 1);
		
		layoutCentro.add(btn7, 0, 2);
		layoutCentro.add(btn8, 1, 2);
		layoutCentro.add(btn9, 2, 2);
		layoutCentro.add(btnMultiplicar, 3, 2);
		
		layoutCentro.add(btnPonto, 0, 3);
		layoutCentro.add(btn0, 1, 3);
		layoutCentro.add(btnIgual, 2, 3);
		layoutCentro.add(btnDividir, 3, 3);
		
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
