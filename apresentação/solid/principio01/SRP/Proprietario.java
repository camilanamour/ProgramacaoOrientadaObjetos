package solid.principio01.SRP;

public class Proprietario {

	public static void main(String[] args) { 
//		PROPRIETÁRIO DA RESIDENCIA - Single Responsiblity Principle (SRP).
		
		Cozinheiro roboCozinheiro = new Cozinheiro();
		Motorista roboMotorista = new Motorista();
		Pintor roboPintor = new Pintor();
		Jardineiro roboJardineiro = new Jardineiro();
		
		roboCozinheiro.cozinhar();
		System.out.println();
		
		roboMotorista.dirigirCarro();
		System.out.println();
		
		roboPintor.pintar();
		System.out.println();
		
		roboJardineiro.cuidarJardim();
	}
}
