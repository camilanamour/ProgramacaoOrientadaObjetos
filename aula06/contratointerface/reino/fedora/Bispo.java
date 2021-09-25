package aula06.contratointerface.reino.fedora;

public class Bispo extends Padre implements Fiel{

	@Override
	public void rezar() {
		System.out.println("Bispo rezando...");
	}

}
