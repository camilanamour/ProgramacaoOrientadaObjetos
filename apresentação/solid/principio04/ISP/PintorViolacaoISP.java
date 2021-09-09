package solid.principio04.ISP;

public class PintorViolacaoISP implements IPedreiro{
	/*
	 *  INCORRETO | Violação Interface Segregation Principle (ISP).
	 *  A implementação dessa interface atende a Classe Pedreiro, mas se for 
	 *  implementar na Classe Pintor não funcionaria. 
	 *  Já que o pintor apenas possui o comportamento de pintar(). 
	 *  Assim, não deve forçar uma classe a implementar algo que ela não usará 
	 *  (rebocar(), prepararCimento()).
	 */
	

	@Override
	public void pintar() {
		System.out.println("Estou pintando...");
		
	}

	@Override
	public void rebocar() {
		// Não possui esse comportamento.
	}

	@Override
	public void prepararCimento() {
		// Não possui esse comportamento.
		
	}

}
