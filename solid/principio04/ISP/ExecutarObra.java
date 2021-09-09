package solid.principio04.ISP;

public interface ExecutarObra extends Pintar{
	
	/*
	 * CORRETO | Interface Segregation Principle (ISP). Essa interface � espec�fica.
	 * Comportamentos que apenas Pedreiro possui e herda o comportamento da interface Pintar.
	 * Heran�a de interfaces.
	 */
	
	public void rebocar();
	public void prepararCimento();
}
