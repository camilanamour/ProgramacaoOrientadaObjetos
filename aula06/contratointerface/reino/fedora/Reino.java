package aula06.contratointerface.reino.fedora;

public class Reino {

	/*
	 * No reino Fedora, há um Principe e um Conde que disputam pelo poder, 
	 * ambos são do tipo Nobre e dessa forma herdam o comportamento governar(), 
	 * porém o Principe além de Nobre ele também se comporta como um Cavaleiro. 
	 * Todo o Cavaleiro sabe duelar(). 
	 * A Rainha também é Nobre porém além disso ela sabe fazerDiplomacia() que é a arte do Diplomata.
	 * Todo o Nobre possui um Conselheiro e um conjunto de Soldado, 
	 * o Conselheiro possui vários Bispo a sua disposição e 
	 * por sua vez o Bispo herda de Padre e implementa Fiel, onde todo o Fiel sabe rezar().
	 * 
	 */
	public static void main(String[] args) {
		
		Reino reino = new Reino();
		
		Principe p = new Principe();
		p.soldados.add(reino.encontrarSoldado());
		p.conselheiro = reino.encontrarConselheiro();
		p.conselheiro.bispos.add(reino.encontrarBispo());
		p.governar();
		p.duelar();
		p.conselheiro.bispos.get(0).rezar();
		System.out.println();
		
		Conde c = new Conde();
		c.soldados.add(reino.encontrarSoldado());
		c.conselheiro = reino.encontrarConselheiro();
		c.conselheiro.bispos.add(reino.encontrarBispo());
		c.governar();
		System.out.println();
		
		Rainha r = new Rainha();
		r.soldados.add(reino.encontrarSoldado());
		r.conselheiro = reino.encontrarConselheiro();
		r.conselheiro.bispos.add(reino.encontrarBispo());
		r.governar();
		r.fazerDiplomacia();
		
		
	}
	
	public Conselheiro encontrarConselheiro(){
		return new Conselheiro();
	}
	
	public Soldado encontrarSoldado(){
		return new Soldado();
	}
	
	public Bispo encontrarBispo(){
		return new Bispo();
	}

}
