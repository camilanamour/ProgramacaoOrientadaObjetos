package aula04.dependencia.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	private String nome;
	private int qtdFuncionario;
	private int qtdAeronave;
	public List<Aeronave> listaAeronave;
	
	public Aeroporto(String nome, int qtdFuncionario, int qtdAeronave){
		this.nome = nome;
		this.qtdFuncionario = qtdFuncionario;
		this.qtdAeronave = qtdAeronave;
		listaAeronave = new ArrayList<Aeronave>();
	}
	
	public void viajar(){
		System.out.printf("O aeroporto %s está aberto.%n", this.nome);
	}

}
