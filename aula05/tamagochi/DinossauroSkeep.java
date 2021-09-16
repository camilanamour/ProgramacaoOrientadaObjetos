package aula05.tamagochi;

public class DinossauroSkeep {

	int energia;
	int velocidade;
	int temperatura;
	boolean humor;
	
	public DinossauroSkeep() {
		this.energia = 0;
		this.velocidade = 0;
		this.temperatura = 0;
		this.humor = false;
	}

	public void pular() {
		energia-=10;
		velocidade-=10;
		humor=true;
	}

	public void correr() {
		energia-=10;
		velocidade-=10;
		humor=true;
	}
	
	public void comer() {
		energia+=10;
		velocidade-=10;
		humor=true;
	}
	
	public void cantar() {
		energia-=10;
		humor=true;
	}
	
	public void tomarSol() {
		velocidade+=20;
		temperatura+=10;
		humor=true;
	}
	
	public void ficarNaSombra() {
		energia+=20;
		temperatura=-10;
		humor=false;
	}
}
