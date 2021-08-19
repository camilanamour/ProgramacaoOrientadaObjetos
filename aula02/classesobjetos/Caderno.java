package aula02.classesobjetos;

public class Caderno {
	
//	Características (5)
	public String capa;
	public String tipo; // espiral ou brochura
	public int numeroPaginas;
	public int qtdMaterias;
	public String formato;
	public boolean aberto = false;
	StringBuffer folhas = new StringBuffer();
	
//	Comportamentos (3)
	public void abrir(){
		System.out.println("O caderno foi aberto.");
		aberto = true;
	}
	
	public void escrever(String texto){
		if(aberto){
			folhas.append(texto);
			folhas.append("\n");
			System.out.println("Foi escrito.");
		} else {
			System.out.println("Abra o caderno primeiro!");
		}
	}
	
	public void fechar(){
		System.out.println("O caderno foi fechado.\n");
		aberto = false;
	}
	
	public void ler(){
		if(aberto){
			System.out.println();
			System.out.println ("Leitura:\n" + folhas.toString());
		} else {
			System.out.println("Abra o caderno primeiro!");
		}
	}
	
	
	

}
