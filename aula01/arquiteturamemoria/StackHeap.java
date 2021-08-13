package aula01.arquiteturamemoria;

import java.util.Scanner;

public class StackHeap {
	/*
	 * Exerc�cio
	 * Fa�a um programa que solicite ao usu�rio para digitar dois n�meros 
	 * que ser�o guardados em vari�veis do tipo double, e
	 * em seguida o programa deve mostrar a soma destas vari�veis na tela.
	 * Assumindo que a primeira linha � aquela linha executada em primeiro 
	 * na fun��o public static void main, fa�a um desenho da mem�ria Stack e Heap 
	 * no momento em que o c�digo estiver executando a 5� linha.
	 */

	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		double n1 = teclado.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		double n2 = teclado.nextDouble(); // 5� linha
		double soma = (n1 + n2);
		System.out.printf("A soma �: %.2f", soma);
		teclado.close();
	}

}
