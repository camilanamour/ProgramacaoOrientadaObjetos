package aula01.arquiteturamemoria;

import java.util.Scanner;

public class StackHeap {
	/*
	 * Exercício
	 * Faça um programa que solicite ao usuário para digitar dois números 
	 * que serão guardados em variáveis do tipo double, e
	 * em seguida o programa deve mostrar a soma destas variáveis na tela.
	 * Assumindo que a primeira linha é aquela linha executada em primeiro 
	 * na função public static void main, faça um desenho da memória Stack e Heap 
	 * no momento em que o código estiver executando a 5ª linha.
	 */

	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double n1 = teclado.nextDouble();
		System.out.println("Digite o segundo número:");
		double n2 = teclado.nextDouble(); // 5º linha
		double soma = (n1 + n2);
		System.out.printf("A soma é: %.2f", soma);
		teclado.close();
	}

}
