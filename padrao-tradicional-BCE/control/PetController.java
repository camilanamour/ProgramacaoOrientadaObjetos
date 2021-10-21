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

public class PetController {
	
	public LongProperty id = new SimpleLongProperty(0);
    public StringProperty nome = new SimpleStringProperty("");
    public StringProperty raca = new SimpleStringProperty("");
    public DoubleProperty peso = new SimpleDoubleProperty(0);
    public ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<LocalDate>(LocalDate.now());
	
	private List<Pet> listaPets = new ArrayList<Pet>();

	public void adicionar() {
		Pet p = toEntity();
		listaPets.add(p);
		fromEntity(new Pet());
	}
	
	public void pesquisar(){
		for(Pet p: listaPets){
			if(p.getNome().contains(nome.get())){
				fromEntity(p);
				break;
			}
		}
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
}
