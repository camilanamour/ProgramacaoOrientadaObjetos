package aula03.metodos;

import java.util.Scanner;

public class ConversorData {
	private int dia;
	private int mes;
	private int ano;
	
	
	public ConversorData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int dataJuliana(){
		int dataJuliana = (1461 * ( ano + 4800 + ( mes - 14)/12 ) ) / 4 +
		( 367 * ( mes - 2- 12 * ( ( mes - 14)/12 ) ) ) /12 -
		( 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 ) ) / 4 + dia - 32075;
		return dataJuliana;
	}
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.println("Digite o mês: ");
		int mes = teclado.nextInt();
		System.out.println("Digite o ano: ");
		int ano = teclado.nextInt();
		teclado.close();
		
		ConversorData converter = new ConversorData(dia, mes, ano);
		System.out.printf("Para o calendário Gregoriano %d/%d/%d: %nO número correspondente no Calendário Juliano: %d",
				dia, mes, ano, converter.dataJuliana());

	}
	
}
