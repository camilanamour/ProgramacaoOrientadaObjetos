package aula02.classesobjetos;

public class Principal {
	
	/*
	 * CRIAR CLASSES
	 * A partir de objetos comuns, crie 3 classes, abstraindo ao menos 5 características e 3 comportamentos para cada uma.
	 * --> Classes: Caderno, Cachorro, Pessoa.
	 * 
	 * INSTANCIAR OBJETOS
	 * Com base nas classes criadas no exercício anterior, instancie 2 objetos para cada classe, 
	 * e escreva os códigos necessários para modificar suas características e executar seus comportamentos.
	 */

	public static void main(String[] args) {
//  --- Caderno --------------------------------------------------------------------------------------------
		
//		Objeto 1
		Caderno bela = new Caderno();
		bela.capa = "Bela"; bela.tipo = "Espiral"; bela.qtdMaterias = 1; bela.numeroPaginas = 100; bela.formato = "A5";
		
		bela.abrir();
		bela.escrever("Esse caderno (" + bela.capa + ") que é o objeto 1 da classe Caderno.");
		bela.fechar();
		
//		Objeto 2
		Caderno barbie = new Caderno();
		barbie.capa = "Barbie";	barbie.tipo = "Espiral"; barbie.qtdMaterias = 10; barbie.formato = "A4"; barbie.numeroPaginas = 200;
		
		barbie.abrir();
		barbie.escrever("Esse caderno (" + barbie.capa + ") que é o objeto 2 da classe Caderno.");
		barbie.fechar();
		
//----- Cachorro --------------------------------------------------------------------------------------------

//		Objeto 1
		Cachorro lipe = new Cachorro();
		lipe.nome = "Lipe"; lipe.porte = "Pequeno"; lipe.raca = "Maltês"; lipe.idade = 9; lipe.peso = 3.0f;
		
		lipe.fala();
		lipe.brincar("bolinha");
		lipe.comer("ração");
		System.out.println();
		
//		Objeto 2
		Cachorro biriba = new Cachorro();
		biriba.nome = "Biriba"; biriba.idade = 4; biriba.porte = "Pequeno"; biriba.raca = "Yorkshire"; biriba.peso = 2.5f;
		
		biriba.fala();
		biriba.brincar("sapato");
		biriba.comer("ração");
		System.out.println();
		
//----- Pessoa --------------------------------------------------------------------------------------------
		
//		Objeto 1
		Pessoa roberto = new Pessoa();
		roberto.nome ="Roberto"; roberto.genero = "masculino"; roberto.peso = 125.0f; roberto.altura = 1.74f; roberto.idade = 44;
		
		roberto.fala(roberto.nome);
		roberto.anda();
		roberto.pensa("Hoje é um ótimo dia!");
		System.out.println();
		
//		Objeto 2
		Pessoa anette = new Pessoa();
		anette.nome = "Anette"; anette.genero = "feminino"; anette.peso = 68.0f; anette.altura = 1.63f; anette.idade = 44;
		
		anette.fala(anette.nome);
		anette.anda();
		anette.pensa("Hoje vou descansar!");
	}

}
