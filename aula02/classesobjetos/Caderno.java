package aula02.classesobjetos;

public class Caderno {
	
//	Características (5)
	public String capa;
	public String tipo; // espiral ou brochura
	public int numeroPaginas;
	public int qtdMaterias;
	public String formato;
	
//	Comportamentos (3)
	public void abrir(){
		System.out.println("O caderno foi aberto.");
	}
	
	public void escrever(String texto){
		System.out.println(texto);
	}
	
	public void fechar(){
		System.out.println("O caderno foi fechado.\n");
	}
	
	
	

}
