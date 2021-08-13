package aula01.arquiteturamemoria;

public class EstouraHeap {
	
	/*
	 * Fa�a um c�digo em Java para estourar a mem�ria Heap (mem�ria para objetos - aponta para os objetos). 
	 * Voc� saber� que o programa foi bem sucedido quando ocorrer um erro de java.lang.OutOfMemoryError: Java heap space.
	 * 
	 * PARA GERAR ESSE ERRO: v�rias inst�ncias de objetos na mem�ria - endere�amento diferentes.
	 * 						 estrutura de dados (vetor, lista) de classes (cada posi��o aponta para uma inst�ncia,
	 *                       assim, o garbage collector (gerenciamento autom�tico de mem�ria) n�o consegue apagar os objetos.
	 */
	
	public static void main(String[] args) {
		int posicoes = 1, contador = 0;
		while(true){
			posicoes *= 1000;
			System.out.println(++contador + ": " + posicoes);
			String[] vetor = new String[posicoes]; // 1.000.000.000 = estoura a mem�ria.
		}
	}

}
