package solid.principio04.ISP;

public class Pedreiro implements ExecutarObra{
	/*
	 * CORRETO | Interface Segregation Principle (ISP).
	 * Pedreiro implementa a interface ExecutarObra, já que ela herda o comportamento da interface mãe, 
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
