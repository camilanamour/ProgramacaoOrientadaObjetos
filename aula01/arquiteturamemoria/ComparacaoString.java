package aula01.arquiteturamemoria;

public class ComparacaoString {
	
	public static void main(String[] args) {
		String a = "A", b = "A"; // aponta para o mesmo objeto.
		
		b=b+""; // cria nova instancia na mem�ria por conta da concatena��o.
		
		if(a == b){ // compara o enderecamento de mem�ria.
			System.out.println("S�o iguais!");
		} else {
			System.out.println("S�o diferentes!");
		}
		
		if(a.equals(b)){ // compara os conte�dos das Strings.
			System.out.println("S�o iguais!");
		} else {
			System.out.println("S�o diferentes!");
		}
	}
}
