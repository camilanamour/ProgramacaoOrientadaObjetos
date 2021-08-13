package aula01.arquiteturamemoria;

public class ConcanarStrings {
	public static void main(String[] args) {
		String numeros = "";
		double inicio, fim, tempo;
		
		//String imut�vel = gerando novas instancias na mem�ria (concatenar)
		inicio = System.currentTimeMillis();
		for(int i=0; i<100000; i++){
			numeros = numeros + i + "\n"; 
		}
		fim = System.currentTimeMillis();
		tempo = ((fim - inicio) / 1000);
		System.out.printf("Tempo gasto (concatenar): %.4fs\n", tempo);
		
		//------------------------------------------------------------------
		
		//String mut�vel = aumenta o tamanho no mesmo endere�o de mem�ria --> MELHOR
		StringBuffer numerosBuffer = new StringBuffer("");
		inicio = System.currentTimeMillis();
		for(int i=0; i<100000; i++){
			numerosBuffer.append(i); 
		}
		fim = System.currentTimeMillis();
		tempo = ((fim - inicio) / 1000);
		System.out.printf("Tempo gasto (buffer): %.4fs", tempo);
		
	}
	
}
