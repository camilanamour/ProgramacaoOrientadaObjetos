package solid.principio04.ISP;

public interface ExecutarObra extends Pintar{
	
	/*
	 * CORRETO | Interface Segregation Principle (ISP). Essa interface é específica.
	 * Comportamentos que apenas Pedreiro possui e herda o comportamento da interface Pintar.
	 * Herança de interfaces.
	 */
	
	public void rebocar();
	public void prepararCimento();
}
