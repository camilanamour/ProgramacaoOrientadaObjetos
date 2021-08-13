package aula01.arquiteturamemoria;

public class EstouraHeap {
	
	/*
	 * Faça um código em Java para estourar a memória Heap (memória para objetos - aponta para os objetos). 
	 * Você saberá que o programa foi bem sucedido quando ocorrer um erro de java.lang.OutOfMemoryError: Java heap space.
	 * 
	 * PARA GERAR ESSE ERRO: várias instâncias de objetos na memória - endereçamento diferentes.
	 * 						 estrutura de dados (vetor, lista) de classes (cada posição aponta para uma instância,
	 *                       assim, o garbage collector (gerenciamento automático de memória) não consegue apagar os objetos.
	 */
	
	public static void main(String[] args) {
		int posicoes = 1, contador = 0;
		while(true){
			posicoes *= 1000;
			System.out.println(++contador + ": " + posicoes);
			String[] vetor = new String[posicoes]; // 1.000.000.000 = estoura a memória.
		}
	}

}
