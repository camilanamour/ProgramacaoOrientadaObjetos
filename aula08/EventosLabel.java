 package aula08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventosLabel extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane painel = new BorderPane();
		
		Label lblTexto = new Label("Texto");
		Button btnOk = new Button("OK");
		
//		Agrega��o p�blica
//		Captura captura = new Captura();
//		captura.lblMensagem = lblTexto;
//		btnOk.addEventFilter(ActionEvent.ANY, captura);
		
//		2� forma - Agrega��o provida pelo construtor
		btnOk.addEventFilter(ActionEvent.ANY, new Captura(lblTexto));
		
//		3� forma - Classe an�nima --> ruim para a arquitetura
//		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>(){
//			public void handle(ActionEvent e){
//				lblTexto.setText("Hello World");
//			}
//		};
//		btnOk.addEventFilter(ActionEvent.ANY, handler);
		
//		4� forma - classe an�nima na chamada do evento
//		btnOk.addEventHandler(ActionEvent.ANY, new EventHandler<ActionEvent>(){
//			public void handle(ActionEvent event) {
//				lblTexto.setText("Hello World");
//			}
//		});
		
//		5� forma - Lambda - sobreescreve interface com fun��o �nica abstrata
//		-- (parametro) -> {c�digo}
//		btnOk.addEventHandler(ActionEvent.ANY, (e) ->{
//			lblTexto.setText("Hello World");
//		});
		
//		6� forma - espera um ActionEvent
//		btnOk.setOnAction((e) -> {
//			lblTexto.setText("Hello World");
//		});
		
		painel.setTop(lblTexto);
		painel.setBottom(btnOk);
		BorderPane.setAlignment(lblTexto, Pos.CENTER);
		BorderPane.setAlignment(btnOk, Pos.CENTER);
		
		Scene scn = new Scene(painel, 300, 200);
		stage.setScene(scn);
		stage.setTitle("Teste de Eventos");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(EventosLabel.class, args);
	}

}

class Captura implements EventHandler<ActionEvent>{
	// Agrega��o 
	// 1� forma - apenas atributo, sendo p�blico;
	Label lblMensagem;
	public Captura(){
		super();
	}
	
	// 2� forma - construtor - com atributo privado
	public Captura(Label lblMensagem) {
		this.lblMensagem = lblMensagem;
	}
	
	@Override
	public void handle(ActionEvent e) {
		lblMensagem.setText("Hello World");
	}
	
}
