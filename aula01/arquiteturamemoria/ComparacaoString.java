package aula01.arquiteturamemoria;

public class ComparacaoString {
	
	public static void main(String[] args) {
		String a = "A", b = "A"; // aponta para o mesmo objeto.
		
		b=b+""; // cria nova instancia na memória por conta da concatenação.
		
		if(a == b){ // compara o enderecamento de memória.
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		
		if(a.equals(b)){ // compara os conteúdos das Strings.
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
	}
}
