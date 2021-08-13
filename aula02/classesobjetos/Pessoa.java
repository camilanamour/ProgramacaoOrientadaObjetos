package aula02.classesobjetos;

public class Pessoa {
//	Características (5)
	String nome;
	String genero;
	int idade;
	float altura;
	float peso;
	
//	Comportamentos (3)
	public void fala(String nome){
		System.out.println("Olá, eu sou: " + nome);
	}
	
	public void anda(){
		System.out.println("Estou andando...");
	}
	
	public void pensa(String pensamento){
		System.out.println("Estou pensando: " + pensamento);
	}
}
