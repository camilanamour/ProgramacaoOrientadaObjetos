package solid.principio04.ISP;

public class Pedreiro implements ExecutarObra{
	/*
	 * CORRETO | Interface Segregation Principle (ISP).
	 * Pedreiro implementa a interface ExecutarObra, j� que ela herda o comportamento da interface m�e, 
	 * pintar(), e possui seus comportamentos, rebocar() e prepararCimento().
	 */

	@Override
	public void pintar() {
		System.out.println("Estou pintando...");
	}

	@Override
	public void rebocar() {
		System.out.println("Estou rebocando...");
	}

	@Override
	public void prepararCimento() {
		System.out.println("Cimento preparado.");
	}

	

}
