package aula02.classesobjetos;

public class Cachorro {
//	Características (5)
	public String nome;
	public String raca;
	public String porte;
	public int idade;
	public float peso;
	
//	Comportamentos (3)
	public void fala(){
		System.out.println("Au Au");
	}
	
	public void brincar(String brinquedo){
		System.out.println("Estou brincando com: " + brinquedo);
	}
	
	public void comer(String comida){
		System.out.println("Estou comendo: " + comida);
	}
}
