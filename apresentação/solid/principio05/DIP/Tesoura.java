package solid.principio05.DIP;

public class Tesoura implements Cortar{ //OCP = assina servi�o
	/*
	 *  CORRETO | Dependency Inversion Principle (DIP).
	 *  Essa classe � a ferramenta necess�ria para executar a a��o - Classe de baixo n�vel.
	 */

	@Override
	public void cortar() {
		System.out.println("Estou podando as plantas..."); // Detalhes (como faz).
		
	}
}
