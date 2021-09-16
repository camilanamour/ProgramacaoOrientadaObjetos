package aula06.contratointerface.empresa;

public class Consultor extends Pessoa implements Pagavel{
	
	@Override
	public void receberPagamento(double valor) {
		System.out.println("Consultor recebendo: " + valor);
		
	}
}
