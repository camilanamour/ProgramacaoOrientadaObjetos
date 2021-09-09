package solid.principio05.DIP;

public interface Cortar {
	
	/* CORRETO | Dependency Inversion Principle (DIP) = OCP + LSP.
	 * A interface � responsavel por conecta as duas classes, 
	 * a que executa a��o (Jardineiro) com uma ferramenta (Tesoura ou facao).
	 * Independente da ferramenta faz a a��o, desde que tenha implementado a interface.
	 */
	
	public void cortar();

}
