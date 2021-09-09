package solid.principio03.LSP;

public class Proprietario {
	
	public static void main(String[] args) {
//		PROPRIET�RIO NA RESIDENCIA - Liskov Substitution Principle (LSP).
		
		Cafeteira roboPai = new Cafeteira();
		CafeDiferenciados roboFilho = new CafeDiferenciados();
		
		System.out.println("Pedindo caf� para o rob� pai (Cafeteira):");
		pedirCafe(roboPai);
		System.out.println("\nPedindo caf� para o rob� filho (Caf�s Diferenciados):");
		pedirCafe(roboFilho);
	}
	
	public static void pedirCafe(Cafeteira robo){
		robo.servirCafe(); 
		/* 
		 * J� que CafeDiferenciados � um subtipo de Cafeteira.
		 * Assim, o m�todo executa as instru��es segundo o objeto que ele recebe.
		 * Por receber do tipo base, caso receba a derivada, a segunda sabe se comportar como 
		 * a primeira, executando a sobreescrita.
		 */
	}
	
	/*
	 * VIOLA��O DO LSP
	 * Sobrescrever/implementar um m�todo que n�o faz nada;
	 * Lan�ar uma exce��o inesperada - que n�o est� na assinatura da classe base;
	 * Retornar valores de tipos diferentes da classe base;
	 */

}
