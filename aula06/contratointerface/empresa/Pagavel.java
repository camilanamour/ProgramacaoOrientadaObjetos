package aula06.contratointerface.empresa;

public interface Pagavel {
	
	void receberPagamento(double valor);
	
//	Métodos padrões, mas podem ser sobreescrito
	default void calcularImposto(){
		System.out.println("Calcula Imposto...");
	}

}
