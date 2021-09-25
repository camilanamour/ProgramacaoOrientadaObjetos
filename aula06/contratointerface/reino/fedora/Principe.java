package aula06.contratointerface.reino.fedora;

public class Principe extends Nobre implements Cavaleiro{

	@Override
	public void governar() {
		System.out.println("Principe está no poder!");
	}

	@Override
	public void duelar() {
		System.out.println("Duelo como um principe.");
	}
	
}
