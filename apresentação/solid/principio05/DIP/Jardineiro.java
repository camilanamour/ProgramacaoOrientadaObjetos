package solid.principio05.DIP;

public class Jardineiro {
	
	public static void main(String[] args) { 
		Tesoura tesoura = new Tesoura();
		Facao facao = new Facao();
		
		cortar(tesoura);
		System.out.println();
		cortar(facao);
		
//		Luva luva = new Luva();
//		cortar(luva); // --> não assinou o serviço.
	}
	
	public static void cortar(Cortar servico){ //LSP = recebe quem assinou o serviço.
		servico.cortar();
	}
	
	/* CORRETO | Dependency Inversion Principle (DIP) = OCP + LSP.
	 * 
	 * OCP = assinar serviços por interface  + LSP = receber parâmetro toda a classe que implementou a interface. 
	 * 
	 *  --> Jarneiro (alto nível) = classe que executa uma ação com uma ferramenta;
	 *  --> Tesoura (baixo nível) = a ferramenta necessária para executar a ação;
	 *  --> Facao (baixo nível) = a ferramenta necessária para executar a ação;
	 *  --> Cortar (interface/abstração) = conecta a classe alto nível (executa) com a baixo nível (ferramenta).
	 */
}
