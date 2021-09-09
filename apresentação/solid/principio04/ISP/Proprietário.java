package solid.principio04.ISP;

public class Propriet�rio {

	public static void main(String[] args) {
//		PROPRIET�RIO DA CASA - Interface Segregation Principle (ISP).
		
		Pintor roboPintor = new Pintor();
		roboPintor.pintar();
		System.out.println();
		
		Pedreiro roboPedreiro = new Pedreiro();
		roboPedreiro.prepararCimento();
		roboPedreiro.rebocar();
		roboPedreiro.pintar();
	}

}
