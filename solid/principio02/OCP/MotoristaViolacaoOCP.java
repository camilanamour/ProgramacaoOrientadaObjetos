package solid.principio02.OCP;

public class MotoristaViolacaoOCP {
	/*
	 *  INCORRETO | Viola��o Open/Closed Principle (OCP).
	 *  Envolve quando novos comportamentos e/ou recursos precisam ser adicionados no sistema.
	 *  Motorista + Seguran�a.
	 */
	
	public void dirigir(){
		System.out.println("Estou dirigindo...");
	}
	
	public void proteger(){ // Novo comportamento do motorista, mas nem todo motorista se comporta como seguran�a.
		System.out.println("Estou alerta para te proteger...");
	}

}
