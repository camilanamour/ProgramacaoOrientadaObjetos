package solid.principio02.OCP;

public class Seguranca implements Dirigir, Assegurar{
	/*
	 *  CORRETO | Open/Closed Principle (OCP).
	 *  A classe apenas adiciona comportamentos, segundo as interfaces implementadas. 
	 *  Estender por serviços assinados (dirigir e assegurar).
	 */
	
	@Override
	public void alerta() {
		System.out.println("Estou em alerta...");
		
	}

	@Override
	public void socorrer(boolean perigo) {
		if(perigo){
			proteger();
		}
	}

	@Override
	public void proteger() {
		System.out.println("Perigo! Pronto para proteger!");
	}


	@Override
	public void dirigirCarro() {
		System.out.println("Estou dirigindo...");
		alerta();
	}
}
