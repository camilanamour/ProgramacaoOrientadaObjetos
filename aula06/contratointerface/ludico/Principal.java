package aula06.contratointerface.ludico;

public class Principal {
	public static void main(String[] args) {
		
		Caixa caixa = new Caixa();
		Carro carro = new Carro();
		
		Abrivel objeto = carro;
		objeto.abrir();
	}
}
