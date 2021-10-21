package padrao.observer;

public class BancaAssinatura {
	public static void main(String[] args) {
		Publicadora veja = new Revista();
		Publicadora istoe = new Revista();
		
		Aposentado joao = new Aposentado("Jo�o");
		Aposentado maria = new Aposentado("Maria");
		Aposentado antonio = new Aposentado("Antonio");
		
		Estudante e = new Estudante();
		
		veja.adicionar(joao);
		istoe.adicionar(maria);
		veja.adicionar(antonio);
		veja.adicionar(antonio);
		istoe.adicionar(e);
		
		veja.encaminhar("Alguma not�cia da Veja");
		istoe.encaminhar("Alguma not�cia da Isto �");
	}
}
