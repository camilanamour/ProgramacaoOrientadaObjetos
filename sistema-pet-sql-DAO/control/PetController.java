package control;

import java.time.LocalDate;
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
import persistence.IPetDao;
import persistence.PetDao;

public class PetController {
	
//  Propriedade para cada elemento
	public LongProperty id = new SimpleLongProperty(0);
    public StringProperty nome = new SimpleStringProperty("");
    public StringProperty raca = new SimpleStringProperty("");
    public DoubleProperty peso = new SimpleDoubleProperty(0);
    public ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<LocalDate>(LocalDate.now());
	
    private ObservableList<Pet> pets = FXCollections.observableArrayList();
    
    private static long count = 0;
    
    private IPetDao petDAO = new PetDao();
    
    public void adicionar() {
        Pet p = new Pet();
        p.setId(++count);
        fromEntity(p);
    }

    public void pesquisar() {
        pets.clear();
        List<Pet> encontrados = petDAO.listarPorNome( nome.get() );
        pets.addAll( encontrados );
        if (!pets.isEmpty()) {
            fromEntity(pets.get(0));
        }
    }

    public void salvar() {
        Pet pet = toEntity();
        petDAO.adicionar(pet);
    }
    
    public void alterar(){
    	Pet pet = toEntity();
        petDAO.atualizar(id.get(), pet);
    }

    public void remover(long id) {
        petDAO.remover(id);
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
    	return pets;
    }
    
}
