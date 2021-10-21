package property;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aluno {
	private StringProperty nome = new SimpleStringProperty();

	public String getNome() {
		return this.nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}
	
	public StringProperty getNomeProperty(){
		// Acessar a propriedade do nome como inteira
		return nome;
	}
}
