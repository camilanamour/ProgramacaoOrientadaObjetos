package aula03.metodos;

public class Carro {
	boolean ligado;
	boolean freioMao;
	float velocidade;
	float consumo;
	String marca;
	String modelo;

	public static void main(String[] args) {
		Carro c1 = new Carro("FIAT", "UNO", 12.0f);	
		Carro c2 = new Carro("GM", "CELTA", 14.0f);
		
		c1.acelerar();
		c1.ligar();
		c1.acelerar();
		c1.freioMaoAbaixado();
		c1.acelerar();
		c1.acelerar();
		c1.freiar();
		
		c2.acelerar();
		
		c1.viajar(128.0f, 574.0f, 75.0f);
		c2.viajar(54.0f, 50.0f);

	}
	
	public Carro(String marca, String modelo, float consumo){
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
		this.ligado = false;
		this.freioMao = true;
		this.velocidade = 0.0f;
		
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
		System.out.println("Freio de mão puxado");
	}
	
	public void freioMaoAbaixado() {
		this.freioMao = false;
		System.out.println("Freio de mão abaixado");
	}
	
	public void acelerar() {
//		String txtLigado = ligado ? "Ligado" : "Desligado"; - Condição Ternária.
//		System.out.printf("O carro está %s %n", txtLigado);
		if(ligado){
			if(!freioMao){
				System.out.println("Vrummm...");
				this.velocidade += 10.0f;
			} else {
				System.out.println("Abaixe o freio de mão");
			}
		} else{
			System.out.println("Primeiro ligue o carro.");
		}
	}
	
	public void freiar() {
		System.out.println("Screeech! iééé!");
		this.velocidade -= 10.0f;
	}

//	public void viajar(float km1, float km2,...){ 
//		float litros = (km1/consumo) + (km2 / consumo)
//	}
	
//	Uso o var-args - para número indeterninado de parâmetros.
	public void viajar(float ... kms){
		float somaLitros = 0.0f; 
		for(int i = 0; i<kms.length; i++){
			somaLitros += (kms[i]/consumo);
		
		}
		System.out.printf("Foram gastos %5.1f livros combustivel em %d viagens %n", somaLitros, kms.length);
	}
	

}
