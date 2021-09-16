package aula05.tamagochi;

import java.util.Scanner;

public class Principal {
	private static Scanner scan;

	public static void main(String[] args) {
		DinossauroSkeep skeep = new DinossauroSkeep();
		scan = new Scanner(System.in);
		do{
			String humor = skeep.humor? "Feliz":"Triste";
			System.out.printf("Energia: %d | Humor: %s | Velocidade: %d | Temperatura: %d %n", 
					skeep.energia, humor, skeep.velocidade, skeep.temperatura);
			System.out.println("\t(P)ular   \t(C)orrer     \tCo(M)er");
			System.out.println("\tC(A)ntar  \tTomar (S)ol  \tFicar na S(O)mbra");
			System.out.println("Digite o que deseja: ");
			String opcao = scan.nextLine().toUpperCase();
			char letra = opcao.charAt(0);
			
			switch(letra){
			case 'A': skeep.cantar(); break;
			case 'C': skeep.correr(); break;
			case 'M': skeep.comer(); break;
			case 'O': skeep.ficarNaSombra(); break;
			case 'P': skeep.pular(); break;
			case 'S': skeep.tomarSol();break;
			default: System.out.println("Opção inválida");
			}
			System.out.println();
		} while(true);
	}

}
