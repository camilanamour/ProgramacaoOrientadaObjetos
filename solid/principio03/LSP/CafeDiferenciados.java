package solid.principio03.LSP;

import java.util.Scanner;

public class CafeDiferenciados extends Cafeteira{
	Scanner teclado;
	
	public CafeDiferenciados(){
		teclado = new Scanner(System.in);
	}
	
	/*
	 *  CORRETO | Liskov Substitution Principle (LSP).
	 *  Classe filho = quando � solicitado o caf� sobreescreve a assinatura do m�todo do pai.
	 *  Oferta algo melhor, diferenciado.
	 */
	
	@Override
	public void servirCafe(){ // sobreescrita.
		System.out.println("Gostaria de um cappuccino? (s/n)");
		String resposta = teclado.nextLine();
		if(resposta.equalsIgnoreCase("s")){
			this.servirCappuccino();
		} else {
			System.out.println("Aqui est� seu caf�.");
		}
		
		
	}
	
	public void servirCappuccino(){
		System.out.println("Aqui est� seu cappuccino.");
	}

}
