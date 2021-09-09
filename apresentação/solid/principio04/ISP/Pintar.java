package solid.principio04.ISP;

public interface Pintar {
	
	/*
	 * CORRETO | Interface Segregation Principle (ISP). Essa interface é específica.
	 * Comportamento que Pedreiro e Pintor têm em comum.
	 */
	
	public void pintar();
}
