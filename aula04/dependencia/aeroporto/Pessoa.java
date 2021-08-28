package aula04.dependencia.aeroporto;

public class Pessoa {
	private String nome;
	private String cpf;
	private float peso;
	
	
	protected void falar(){
		System.out.printf("%s está falando...%n",this.nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
