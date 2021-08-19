package aula02.classesobjetos;

public class Caderno {
	
//	Características (5)
	public String capa;
	public String tipo; // espiral ou brochura
	public int numeroPaginas;
	public int qtdMaterias;
	public String formato;
	public boolean aberto = false;
	
//	Comportamentos (3)
	public void abrir(){
		System.out.println("O caderno foi aberto.");
		aberto = true;
	}
	
	public void escrever(String texto){
		if(aberto){
			System.out.println(texto);
		} else {
			System.out.println("Abra o caderno primeiro!");
		}
	}
	
	public void fechar(){
		System.out.println("O caderno foi fechado.\n");
		aberto = false;
	}
	
	
	

}
