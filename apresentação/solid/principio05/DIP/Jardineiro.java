package solid.principio05.DIP;

public class Jardineiro {
	
	public static void main(String[] args) { 
		Tesoura tesoura = new Tesoura();
		Facao facao = new Facao();
		
		cortar(tesoura);
		System.out.println();
		cortar(facao);
		
//		Luva luva = new Luva();
//		cortar(luva); // --> n�o assinou o servi�o.
	}
	
	public static void cortar(Cortar servico){ //LSP = recebe quem assinou o servi�o.
		servico.cortar();
	}
	
	/* CORRETO | Dependency Inversion Principle (DIP) = OCP + LSP.
	 * 
	 * OCP = assinar servi�os por interface  + LSP = receber par�metro toda a classe que implementou a interface. 
	 * 
	 *  --> Jarneiro (alto n�vel) = classe que executa uma a��o com uma ferramenta;
	 *  --> Tesoura (baixo n�vel) = a ferramenta necess�ria para executar a a��o;
	 *  --> Facao (baixo n�vel) = a ferramenta necess�ria para executar a a��o;
	 *  --> Cortar (interface/abstra��o) = conecta a classe alto n�vel (executa) com a baixo n�vel (ferramenta).
	 */
}
