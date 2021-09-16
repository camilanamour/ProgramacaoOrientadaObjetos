package aula06.contratointerface.empresa;

public class Empresa {
	
	public void fazerPagamento(Pagavel obj, double valor){
		obj.receberPagamento(valor);
	}
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario funcionario = new Funcionario();
		Consultor consultor = new Consultor();
		
//		Classe anômima.
		Pagavel pag = new Pagavel(){
			public void receberPagamento(double valor){
				
			}
		};
		
		Pagavel pfunc = funcionario;
		pfunc.calcularImposto();
		
		empresa.fazerPagamento(funcionario, 1000.0);
		empresa.fazerPagamento(consultor, 1500.0);
	}
}
