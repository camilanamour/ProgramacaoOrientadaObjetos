package solid.principio03.LSP;

import java.util.Scanner;

public class CafeDiferenciados extends Cafeteira{
	Scanner teclado;
	
	public CafeDiferenciados(){
		teclado = new Scanner(System.in);
	}
	
	/*
	 *  CORRETO | Liskov Substitution Principle (LSP).
	 *  Classe filho = quando é solicitado o café sobreescreve a assinatura do método do pai.
	 *  Oferta algo melhor, diferenciado.
	 */
	
	@Override
	public void servirCafe(){ // sobreescrita.
		System.out.println("Gostaria de um cappuccino? (s/n)");
		String resposta = teclado.nextLine();
		if(resposta.equalsIgnoreCase("s")){
			this.servirCappuccino();
		} else {
			System.out.println("Aqui está seu café.");
		}
		
		
	}
	
	public void servirCappuccino(){
		System.out.println("Aqui está seu cappuccino.");
	}

}
