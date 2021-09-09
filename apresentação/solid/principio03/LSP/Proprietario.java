package solid.principio03.LSP;

public class Proprietario {
	
	public static void main(String[] args) {
//		PROPRIETÁRIO NA RESIDENCIA - Liskov Substitution Principle (LSP).
		
		Cafeteira roboPai = new Cafeteira();
		CafeDiferenciados roboFilho = new CafeDiferenciados();
		
		System.out.println("Pedindo café para o robô pai (Cafeteira):");
		pedirCafe(roboPai);
		System.out.println("\nPedindo café para o robô filho (Cafés Diferenciados):");
		pedirCafe(roboFilho);
	}
	
	public static void pedirCafe(Cafeteira robo){
		robo.servirCafe(); 
		/* 
		 * Já que CafeDiferenciados é um subtipo de Cafeteira.
		 * Assim, o método executa as instruções segundo o objeto que ele recebe.
		 * Por receber do tipo base, caso receba a derivada, a segunda sabe se comportar como 
		 * a primeira, executando a sobreescrita.
		 */
	}
	
	/*
	 * VIOLAÇÃO DO LSP
	 * Sobrescrever/implementar um método que não faz nada;
	 * Lançar uma exceção inesperada - que não está na assinatura da classe base;
	 * Retornar valores de tipos diferentes da classe base;
	 */

}
