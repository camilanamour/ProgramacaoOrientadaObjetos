package padrao.observer;

public class Estudante implements Assinante{

	@Override
	public void receberNoticia(String publicacao) {
		System.out.println("O estudante está lendo: " + publicacao);
	}

}
