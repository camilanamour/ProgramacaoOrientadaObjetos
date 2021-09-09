package solid.principio04.ISP;

public interface IPedreiro {
	
	/*
	 *  INCORRETO | Violação Interface Segregation Principle (ISP). 
	 *  Essa interface é genérica. Pedreiro + Pintor.
	 */
	
	public void pintar();
	public void rebocar();
	public void prepararCimento();
}
