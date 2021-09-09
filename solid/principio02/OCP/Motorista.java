package solid.principio02.OCP;

public class Motorista implements Dirigir{
	/*
	 *  CORRETO | Open/Closed Principle (OCP).
	 *  A classe apenas adiciona comportamentos, segundo as interfaces implementadas.
	 */

	@Override
	public void dirigirCarro() {
		System.out.println("Estou dirigindo...");
		
	}

}
