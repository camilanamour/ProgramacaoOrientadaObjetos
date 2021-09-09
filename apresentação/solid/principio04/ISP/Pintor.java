package solid.principio04.ISP;

public class Pintor implements Pintar{
	/*
	 * CORRETO | Interface Segregation Principle (ISP).
	 * Pintor implementa apenas a inteface m�e, Pintar, 
	 * j� que � o �nico comportamento que Pintor possui.
	 */

	@Override
	public void pintar() {
		System.out.println("Estou pintando...");		
	}

}
