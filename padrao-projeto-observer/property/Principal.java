package property;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

class MudancaNome implements ChangeListener<String>{
	@Override
	public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		System.out.println("O nome foi trocado de " + oldValue + " para "
				+ newValue);
		
	}
	
}

public class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		/* 1. Instanciando a classe
		 * MudancaNome observador = new MudancaNome();
		 * a.getNomeProperty().addListener(observador);
		 */
		
		// 2. Lambda
		a.getNomeProperty().addListener((observable, oldValue, newValue) -> {
			System.out.println("O nome foi trocado de " + oldValue + " para " + newValue);
		});
		 
		
		a.setNome("José");
		a.setNome("João");
		a.setNome("Antonio");
		a.setNome("Arthur");
		System.out.println("Nome atual ==> " + a.getNome());
	}
}
