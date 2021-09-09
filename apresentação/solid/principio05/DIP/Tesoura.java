package solid.principio05.DIP;

public class Tesoura implements Cortar{ //OCP = assina serviço
	/*
	 *  CORRETO | Dependency Inversion Principle (DIP).
	 *  Essa classe é a ferramenta necessária para executar a ação - Classe de baixo nível.
	 */

	@Override
	public void cortar() {
		System.out.println("Estou podando as plantas..."); // Detalhes (como faz).
		
	}
}
