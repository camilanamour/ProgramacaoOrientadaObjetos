package aula04.dependencia.aeroporto;

public class Piloto extends Pessoa {

	private int breve;
	private int tempoExperiencia;
	private int horasVoo;

	public Piloto(String nome, String documento, String passaporte, float peso, int breve, int tempoExperiencia, int horasVoo) {
		super(nome, documento, passaporte, peso);
		this.breve = breve;
		this.tempoExperiencia = tempoExperiencia;
		this.horasVoo = horasVoo;
	}

	public void pilotar() {
		System.out.printf("O piloto %s com o brevê %d está pilotando...%n", this.getNome(), this.breve);
	}
}
