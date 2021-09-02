package aula04.dependencia.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	public List<Pessoa> saguaoPrincipal;
	public List<Passageiro> salaEmbarque;
	public List<String> companhiaAereas;
	public List<Aeronave> listaAeronave;
	
	public Aeroporto(){
		listaAeronave = new ArrayList<Aeronave>();
		saguaoPrincipal = new ArrayList<Pessoa>();
		salaEmbarque = new ArrayList<Passageiro>();
		companhiaAereas = new ArrayList<String>();
	}
	
	public void abrir(){
		System.out.println("O aeroporto está aberto.");
	}
	
	public void fechar(){
		System.out.println("O aeroporto está fechado.");
	}
	
	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto();
		
		Piloto joao = new Piloto("João","789.852.744-09", "A9AAF8", 70.0f, 789623, 5, 105);
		Piloto joana = new Piloto("Joana","899.252.698-10", "B57JI9", 60.0f, 874123, 2,25);
		
		Passageiro maria = new Passageiro("Maria", "569.478.956-07", "AF2365", 101.0f, "A20", 50.0f, "C123");
		Passageiro mario = new Passageiro("Mario", "658.785.741-09", "JH1457", 80.0f, "A19", 75.0f, "C124");
		
		Aeronave airbusA320 = new Aeronave(789, "Airbus", "A320", 1, 100.0f);
		Aeronave boeing737 = new Aeronave(159, "Boeing", "737", 50, 800.0f);
		
//		Abrir aeroporto...
		aeroporto.listaAeronave.add(airbusA320);
		aeroporto.listaAeronave.add(boeing737);
		aeroporto.abrir();
		aeroporto.saguaoPrincipal.add(joao);
		aeroporto.saguaoPrincipal.add(joana);
		aeroporto.saguaoPrincipal.add(maria);
		aeroporto.saguaoPrincipal.add(mario);
		
//		CheckIn
		joao.checkin();
		maria.checkin();
		joana.checkin();
		mario.checkin();
		
		airbusA320.piloto = joao;
		airbusA320.listaPassageiro.add(maria);
		boeing737.piloto = joana;
		boeing737.listaPassageiro.add(mario);
		
//		Embarque
		aeroporto.saguaoPrincipal.remove(maria);
		aeroporto.salaEmbarque.add(maria);
		aeroporto.saguaoPrincipal.remove(mario);
		aeroporto.salaEmbarque.add(mario);
				
		maria.embarcar();
		mario.embarcar();
		joao.pilotar();
		joana.pilotar();
		
		airbusA320.decolar();
		boeing737.decolar();
	}
}
