package boundary;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principal extends Application{ // Contexto

	private PetBoundary petBound = new PetBoundary();
	private CreditoBoundary cBound = new CreditoBoundary();
	
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 800, 600);
		
		MenuBar menuBar = new MenuBar();
		Menu mArquivo = new Menu("Arquivo");
		Menu mCadastro = new Menu("Cadastro");
		Menu mAjuda = new Menu("Ajuda");
		
		menuBar.getMenus().addAll(mArquivo, mCadastro, mAjuda);
		
		MenuItem mItemSair = new MenuItem("Sair");
		mItemSair.setOnAction((e) ->{
			Platform.exit();
			System.exit(0);
		});
		
		MenuItem mItemPet = new MenuItem("Pets");
		mItemPet.setOnAction((e) ->{
			bp.setCenter(petBound.render());
		});
		
		MenuItem mItemCredito = new MenuItem("Créditos");
		mItemCredito.setOnAction((e) ->{
			bp.setCenter(cBound.render());
		});
		
		mArquivo.getItems().addAll(mItemSair);
	    mCadastro.getItems().addAll(mItemPet);
	    mAjuda.getItems().addAll(mItemCredito);

	    bp.setTop(menuBar);
		
		stage.setScene(scn);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Principal.class,args);
	}

}
