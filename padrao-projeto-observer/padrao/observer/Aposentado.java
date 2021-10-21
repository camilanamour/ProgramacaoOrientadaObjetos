package padrao.observer;

public class Aposentado implements Assinante{
	private String nome;

	public Aposentado(String nome) {
		this.nome = nome;
	}
	@Override
	public void receberNoticia(String publicacao) {
		System.out.println(nome + " recebeu a publicação: " + publicacao);		
	}
	
	

}
