package padrao.observer;

public class BancaAssinatura {
	public static void main(String[] args) {
		Publicadora veja = new Revista();
		Publicadora istoe = new Revista();
		
		Aposentado joao = new Aposentado("João");
		Aposentado maria = new Aposentado("Maria");
		Aposentado antonio = new Aposentado("Antonio");
		
		Estudante e = new Estudante();
		
		veja.adicionar(joao);
		istoe.adicionar(maria);
		veja.adicionar(antonio);
		veja.adicionar(antonio);
		istoe.adicionar(e);
		
		veja.encaminhar("Alguma notícia da Veja");
		istoe.encaminhar("Alguma notícia da Isto é");
	}
}
