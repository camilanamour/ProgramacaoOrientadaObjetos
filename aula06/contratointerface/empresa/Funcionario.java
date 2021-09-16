package aula06.contratointerface.empresa;

public class Funcionario extends Pessoa 
implements Assalariavel{

	@Override
	public void receberPagamento(double valor) {
		System.out.println("Funcionário recebendo: " + valor);
	}

	@Override
	public void prestarServico() {
		System.out.println("Funcionário trabalhando");
		
	}
	
		@Override
	public void calcularImposto() {
		Assalariavel.super.calcularImposto();
		System.out.println("Imposto funcionario");
	}
	

}
