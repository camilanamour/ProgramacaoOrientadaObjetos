package aula04.dependencia.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Pessoa {

	private int breve;
	private int tempoExperiencia;
	private int qtdVoos;
	public  List<Aeronave> listaAeronave;

	public Piloto(String nome, String cpf, float peso, int breve, int tempoExperiencia, int qtdVoos) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setPeso(peso);
		this.breve = breve;
		this.tempoExperiencia = tempoExperiencia;
		this.qtdVoos = qtdVoos;
		listaAeronave = new ArrayList<Aeronave>();
	}

	public void pilotar() {
		System.out.printf("O piloto %s com o brevê %d está pilotando...%n", this.getNome(), this.breve);
		falar();
	}
}
