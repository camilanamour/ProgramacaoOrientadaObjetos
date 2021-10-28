package control;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entity.Pet;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PetController {
	
//  Propriedade para cada elemento
	public LongProperty id = new SimpleLongProperty(0);
    public StringProperty nome = new SimpleStringProperty("");
    public StringProperty raca = new SimpleStringProperty("");
    public DoubleProperty peso = new SimpleDoubleProperty(0);
    public ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<LocalDate>(LocalDate.now());
	
    private static long counter = 0;
    
	private List<Pet> PetsGeral = new ArrayList<Pet>();
    private ObservableList<Pet> listaPets = FXCollections.observableArrayList();
	
    public void adicionar() {
      Pet p = new Pet();
      p.setId(++counter);
      fromEntity(p);
  }
	
	public void pesquisar(){
		listaPets.clear();
		for(Pet p: PetsGeral){
			if(p.getNome().contains(nome.get())){
//				fromEntity(p);
//				break;
				listaPets.add(p);
			}
		}
		
		if(!listaPets.isEmpty()){
			fromEntity(listaPets.get(0));
		}
	}
	
	public void alterar(){
		Pet pet = toEntity();
		boolean encontrado = false;
		for(int i=0; i< PetsGeral.size(); i++){
			Pet p = PetsGeral.get(i);
			if(id.get() == p.getId()){
				PetsGeral.set(i, pet);
				encontrado = true;
				this.updateLista();
			}
		}
		
		if(!encontrado){
			PetsGeral.add(pet);
			updateLista();
		}
	}
	
	public void updateLista(){
		listaPets.clear();
		listaPets.addAll(PetsGeral);
	}
	
	public Pet toEntity() {
        Pet p = new Pet();
        p.setId(id.get());
        p.setNome(nome.get());
        p.setRaca(raca.get());
        p.setPeso(peso.get());
        p.setDataNascimento((LocalDate) nascimento.get());
        return p;
    }

    public void fromEntity(Pet p) {
        id.set(p.getId());
        nome.set(p.getNome());
        raca.set(p.getRaca());
        peso.set(p.getPeso());
        nascimento.set(p.getDataNascimento());
    }
    
    public ObservableList<Pet> getLista(){
    	return listaPets;
    }
}
