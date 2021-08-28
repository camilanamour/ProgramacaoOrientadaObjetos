package aula04.dependencia.aeroporto;

public class Passageiro extends Pessoa{
	
	private String passaporte;
	private float pesoBagagem;
	private int milhasAereas;
	public Aeronave aeronave;
	
	public Passageiro(String nome, String cpf, float peso, String passaporte, float pesoBagagem, int milhasAereas){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setPeso(peso);
		this.passaporte = passaporte;
		this.pesoBagagem = pesoBagagem;
		this.milhasAereas = milhasAereas;
	}
	
	public void embarcar(){
		System.out.printf("O passageiro %s com o passaporte %s embarcou.%n", this.getNome(), this.passaporte);
		falar();
	}

}
