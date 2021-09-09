package solid.principio04.ISP;

public interface IPedreiro {
	
	/*
	 *  INCORRETO | Viola��o Interface Segregation Principle (ISP). 
	 *  Essa interface � gen�rica. Pedreiro + Pintor.
	 */
	
	public void pintar();
	public void rebocar();
	public void prepararCimento();
}
