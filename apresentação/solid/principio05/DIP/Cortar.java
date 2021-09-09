package solid.principio05.DIP;

public interface Cortar {
	
	/* CORRETO | Dependency Inversion Principle (DIP) = OCP + LSP.
	 * A interface é responsavel por conecta as duas classes, 
	 * a que executa ação (Jardineiro) com uma ferramenta (Tesoura ou facao).
	 * Independente da ferramenta faz a ação, desde que tenha implementado a interface.
	 */
	
	public void cortar();

}
