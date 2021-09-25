package aula06.contratointerface.reino.fedora;

public class Rainha extends Nobre implements Diplomata{

	@Override
	public void governar() {
		System.out.println("Rainha está no poder!");
	}
	
	@Override
	public void fazerDiplomacia() {
		System.out.println("Rainha agindo com diplomacia.");
	}

}
