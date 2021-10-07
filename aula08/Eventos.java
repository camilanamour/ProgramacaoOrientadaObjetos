 package aula08;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Eventos extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane painel = new BorderPane();
		Capturador captura = new Capturador();
		
		Button btnOk = new Button("OK");
		btnOk.addEventFilter(MouseEvent.MOUSE_CLICKED, captura);
		painel.setBottom(btnOk);
		BorderPane.setAlignment(btnOk, Pos.CENTER);
		
		Scene scn = new Scene(painel, 300, 200);
		stage.setScene(scn);
		stage.setTitle("Teste de Eventos");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Eventos.class, args);
	}

}

class Capturador implements EventHandler<MouseEvent>{

	@Override
	public void handle(MouseEvent event) {
		System.out.println("Hello World!");
		
	}
	
}
