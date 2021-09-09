package solid.principio04.ISP;

public class PintorViolacaoISP implements IPedreiro{
	/*
	 *  INCORRETO | Viola��o Interface Segregation Principle (ISP).
	 *  A implementa��o dessa interface atende a Classe Pedreiro, mas se for 
	 *  implementar na Classe Pintor n�o funcionaria. 
	 *  J� que o pintor apenas possui o comportamento de pintar(). 
	 *  Assim, n�o deve for�ar uma classe a implementar algo que ela n�o usar� 
	 *  (rebocar(), prepararCimento()).
	 */
	

	@Override
	public void pintar() {
		System.out.println("Estou pintando...");
		
	}

	@Override
	public void rebocar() {
		// N�o possui esse comportamento.
	}

	@Override
	public void prepararCimento() {
		// N�o possui esse comportamento.
		
	}

}
