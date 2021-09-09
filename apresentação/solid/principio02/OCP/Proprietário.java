package solid.principio02.OCP;

public class Proprietário {

	public static void main(String[] args) {
//		PROPRIETÁRIO NA RUA - Open/Closed Principle (OCP).
		
		Motorista roboMotorista = new Motorista();
		roboMotorista.dirigirCarro();
		System.out.println();
		
		Seguranca roboSeguranca = new Seguranca();
		roboSeguranca.dirigirCarro();
		roboSeguranca.socorrer(true);
	}

}
