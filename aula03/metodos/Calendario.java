package aula03.metodos;

import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		int dia = teclado.nextInt();
		
		System.out.println("Digite o mês: ");
		int mes = teclado.nextInt();
		
		System.out.println("Digite o ano: ");
		int ano = teclado.nextInt();
		
		teclado.close();
		System.out.printf("Para o calendário Gregoriano %d/%d/%d: %nO número correspondente no Calendário Juliano: %d",
				dia, mes, ano, conveterParaDataJuliana(dia, mes, ano));

	}
	
	public static int conveterParaDataJuliana(int dia, int mes, int ano){
		int dataJuliana = (1461 * ( ano + 4800 + ( mes - 14)/12 ) ) / 4 +
		( 367 * ( mes - 2- 12 * ( ( mes - 14)/12 ) ) ) /12 -
		( 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 ) ) / 4 + dia - 32075;
		return dataJuliana;
	}

}
