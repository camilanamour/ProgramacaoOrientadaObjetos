package aula04.dependencia.aeroporto;

public class Passageiro extends Pessoa{
	
	private String numeroAssento;
	private float pesoBagagem;
	private String cartaoEmbarque;
	public Aeronave aeronave;
	
	public Passageiro(String nome, String documento, String passaporte, float peso, String numeroAssento, float pesoBagagem, 
			String cartaoEmbarque){
		super(nome, documento, passaporte, peso);
		this.numeroAssento = numeroAssento;
		this.pesoBagagem = pesoBagagem;
		this.cartaoEmbarque = cartaoEmbarque;
	}
	
	public void embarcar(){
		System.out.printf("O passageiro %s com o passaporte %s embarcou.%n", super.getNome(), super.getPassaporte());
	}
	
	public void desembarcar(){
		System.out.printf("O passageiro %s com o passaporte %s desembarcou.%n", super.getNome(), super.getPassaporte());
	}

}
