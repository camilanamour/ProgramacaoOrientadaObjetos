package aula04.dependencia.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {
	private int numero;
	private int qtdAssento;
	private float pesoMaximo;
	public Aeroporto aeroporto;
	public Piloto piloto;
	public List<Passageiro> listaPassageiro;
	
	public Aeronave(int numero, int qtdAssento, float pesoMaximo) {
		this.numero = numero;
		this.qtdAssento = qtdAssento;
		this.pesoMaximo = pesoMaximo;
		listaPassageiro = new ArrayList<Passageiro>();
	}
	
	public void decolar(){
		if(listaPassageiro.size() == qtdAssento){
			float total = somarPeso();
			if(total <= this.pesoMaximo){
				System.out.printf("A aeronave %d está decolando.%n", this.numero);
			} else {
				System.out.println("Sobrepeso!! Há " + (total - pesoMaximo) + "kg acima do permitido na aeronave " + this.numero + "!");
			}
		} else {
			System.out.println("Ainda há " + (qtdAssento - listaPassageiro.size()) + " lugar(es) na aeronave " + this.numero + "!");
		}
		
	}
	
	public float somarPeso(){
		float total = 0;
		for(Passageiro p : listaPassageiro){
			total += p.getPeso();
		}
		return total;
	}
	
}
