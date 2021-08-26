package aula04.dependencia;

public class Pessoa {
	String nome;
	private Celular celular; //agregação - qualquer um reutiliza - algo aberto.
	private Coracao coracao; //composição - ninguém reutiliza - algo fechado.

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
	}
	
	public static void main(String[] args) {
		Pessoa joao = new Pessoa(); //acesso por referência
		Pessoa maria = new Pessoa();
		
		Celular motorola = new Celular();
		Celular lg = new Celular();
		
		joao.celular = motorola; // agregação - de fora atribuindo e tirando
		maria.celular = lg;
		
		joao.celular = lg; 
		maria.celular = motorola;
		
//		joao.figado = new Figado() = não dá pq é composição
		
	}

}
