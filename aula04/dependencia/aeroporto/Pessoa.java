package aula04.dependencia.aeroporto;

public class Pessoa {
	private String nome;
	private String documento;
	private String passaporte;
	private float peso;
	
	public Pessoa(String nome, String documento, String passaporte, float peso) {
		this.nome = nome;
		this.passaporte = passaporte;
		this.documento = documento;
		this.peso = peso;
	}
	
	protected void checkin(){
		System.out.printf("%s, com documento %s e passaporte %s fez check in.%n",this.nome, this.documento, this.passaporte);
	}
	
	public String getNome() {
		return nome;
	}
	public String getDocumento() {
		return documento;
	}
	public float getPeso() {
		return peso;
	}
	public String getPassaporte(){
		return passaporte;
	}
}
