package control;

import java.time.LocalDate;

import entity.Aluno;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AlunoController {
	
	public LongProperty id = new SimpleLongProperty(0);
	public StringProperty ra = new SimpleStringProperty("");
    public StringProperty nome = new SimpleStringProperty("");
    public ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<LocalDate>(LocalDate.now());
	
	private ObservableList<Aluno> alunos = FXCollections.observableArrayList();

	public void adicionar(){
		Aluno aluno = this.toEntity();
		alunos.add(aluno);
//		System.out.println(alunos);
		fromEntity(new Aluno());
	}
	
	public void pesquisar(){
		for(Aluno aluno: alunos){
			if(aluno.getRa().equals(ra.get())){
				this.fromEntity(aluno);
				break;
			}
		}
	}
	
	public Aluno toEntity() {
		Aluno aluno = new Aluno();
		aluno.setId(id.get());
		aluno.setRa(ra.get());
		aluno.setNome(nome.get());
		aluno.setNascimento((LocalDate) nascimento.get());
        return aluno;
    }

    public void fromEntity(Aluno aluno) {
        id.set(aluno.getId());
        ra.set(aluno.getRa());;
        nome.set(aluno.getNome());
        nascimento.set(aluno.getNascimento());
    }
    
    public ObservableList<Aluno> getLista(){
    	return alunos;
    }

}
