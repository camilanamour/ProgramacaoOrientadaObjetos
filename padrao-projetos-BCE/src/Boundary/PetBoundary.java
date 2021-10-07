package Boundary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Entity.Pet;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application{
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtRaca = new TextField();
	private TextField txtPeso = new TextField();
	private TextField txtDataNascimento = new TextField();
	
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pequisar");
	
	private List<Pet> listaPets= new ArrayList<Pet>();

	@Override
	public void start(Stage stage) throws Exception {
		GridPane panPrincipal = new GridPane();
		
		panPrincipal.add(new Label("Id:"), 0, 0);
		panPrincipal.add(txtId, 1, 0);
		panPrincipal.add(new Label("Nome:"), 0, 1);
		panPrincipal.add(txtNome, 1, 1);
		panPrincipal.add(new Label("Raça:"), 0, 2);
		panPrincipal.add(txtRaca, 1, 2);
		panPrincipal.add(new Label("Peso:"), 0, 3);
		panPrincipal.add(txtPeso, 1, 3);
		panPrincipal.add(new Label("Nascimento:"), 0, 4);
		panPrincipal.add(txtDataNascimento, 1, 4);
		
		panPrincipal.add(btnAdicionar, 0, 5);
		panPrincipal.add(btnPesquisar, 1, 5);
		
		btnAdicionar.setOnAction((e) -> {
			Pet p = this.boundaryToEntity();
			listaPets.add(p);
			System.out.println(listaPets);
		});
		
		btnPesquisar.setOnAction((e) -> {
			for(Pet p: listaPets){
				if(p.getNome().equals(txtNome.getText())){
					this.entityToBoundary(p);
					break;
				}
			}
		});
		
		Scene scn = new Scene(panPrincipal, 250, 180);
		stage.setScene(scn);
		stage.setTitle("Gestão Pets");
		stage.show();
	}
	
	public Pet boundaryToEntity(){
		Pet p = new Pet();
		try{
		p.setId(Long.parseLong(txtId.getText()));
		p.setNome(txtNome.getText());
		p.setRaca(txtRaca.getText());
		p.setPeso(Double.parseDouble(txtPeso.getText()));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt = LocalDate.parse(txtDataNascimento.getText(), dtf);
		p.setDataNascimento(dt);
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
		return p;
	}
	
	public void entityToBoundary(Pet p){
		if(p != null){
			txtId.setText(String.valueOf(p.getId()));
			txtNome.setText(p.getNome());
			txtRaca.setText(p.getRaca());
			txtPeso.setText(String.valueOf(p.getPeso()));
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String strNascimento = dtf.format(p.getDataNascimento());
			txtDataNascimento.setText(strNascimento);
			
		}
	}
	
	public static void main(String[] args) {
		Application.launch(PetBoundary.class, args);
	}
}
