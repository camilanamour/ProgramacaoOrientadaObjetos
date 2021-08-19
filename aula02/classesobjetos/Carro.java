package aula02.classesobjetos;

public class Carro {
	boolean ligado = false;
	boolean freioMao = true;
	float velocidade = 0.0f;
	float consumo;
	String marca;
	String modelo;

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.marca = "FIAT";
		c1.modelo = "UNO";
		c1.consumo = 12.0f;
		
		Carro c2 = new Carro();
		c1.marca = "GM";
		c1.modelo = "CELTA";
		c1.consumo = 14.0f;
		
		c1.acelerar();
		c1.ligar();
		c1.acelerar();
		c1.freioMaoAbaixado();
		c1.acelerar();
		c1.acelerar();
		c1.freiar();
		
		c2.acelerar();
		
		c1.viajar(128.0f, 574.0f, 75.0f);

	}

	public void ligar() {
		this.ligado = true;
		System.out.println("Carro ligado");
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("Carro desligado");
	}
	
	public void freioMaoPuxado() {
		this.freioMao = true;
		System.out.println("Freio de m�o puxado");
	}
	
	public void freioMaoAbaixado() {
		this.freioMao = false;
		System.out.println("Freio de m�o abaixado");
	}
	
	public void acelerar() {
//		String txtLigado = ligado ? "Ligado" : "Desligado"; - Condi��o Tern�ria.
//		System.out.printf("O carro est� %s %n", txtLigado);
		if(ligado){
			if(!freioMao){
				System.out.println("Vrummm...");
				this.velocidade += 10.0f;
			} else {
				System.out.println("Abaixe o freio de m�o");
			}
		} else{
			System.out.println("Primeiro ligue o carro.");
		}
	}
	
	public void freiar() {
		System.out.println("Screeech! i���!");
		this.velocidade -= 10.0f;
	}

//	public void viajar(float km1, float km2,...){ 
//		float litros = (km1/consumo) + (km2 / consumo)
//	}
	
//	Uso o var-args - para n�mero indeterninado de par�metros.
	public void viajar(float ... kms){
		float somaLitros = 0.0f; 
		for(int i = 0; i<kms.length; i++){
			somaLitros += (kms[i]/consumo);
		
		}
		System.out.printf("Foram gastos %5.1f livros combustivel em %d viagens %n", somaLitros, kms.length);
	}
	

}
