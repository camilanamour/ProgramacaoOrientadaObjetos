package aula04.dependencia.aeroporto;

public class Principal {

	public static void main(String[] args) {
		Piloto joao = new Piloto("João","789.852.744-09", 70.0f, 789623, 5,105);
		Piloto joana = new Piloto("Joana","899.252.698-10", 60.0f, 874123, 2,25);
		
		Passageiro maria = new Passageiro("Maria", "569.478.956-07", 101.0f, "AF2365", 50.0f, 1000);
		Passageiro mario = new Passageiro("Mario", "658.785.741-09", 80.0f, "AH7489", 75.0f, 1250);
		
		Aeroporto aeroporto01 = new Aeroporto("Guarulhos", 1500, 25);
		Aeroporto aeroporto02 = new Aeroporto("Congonhas", 1800, 30);
		
		Aeronave aeronave01 = new Aeronave(789, 1, 100.0f);
		Aeronave aeronave02 = new Aeronave(159, 50, 800.0f);
		
		aeroporto01.listaAeronave.add(aeronave01);
		aeroporto01.listaAeronave.add(aeronave02);
		aeroporto01.viajar();
		
		aeronave01.aeroporto = aeroporto01;
		aeronave01.piloto = joao;
		aeronave01.listaPassageiro.add(maria);
		
		aeronave02.aeroporto = aeroporto01;
		aeronave02.piloto = joana;
		aeronave02.listaPassageiro.add(mario);
		
		
		joao.listaAeronave.add(aeronave01);
		joana.listaAeronave.add(aeronave02);
		
		maria.aeronave = aeronave01;
		mario.aeronave = aeronave02;
		
		maria.embarcar();
		mario.embarcar();
		joao.pilotar();
		joana.pilotar();
		aeronave01.decolar();
		aeronave02.decolar();
	}

}
