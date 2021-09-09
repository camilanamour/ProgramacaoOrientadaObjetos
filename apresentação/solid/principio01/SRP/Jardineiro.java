package solid.principio01.SRP;

public class Jardineiro {
	/*
	 *  CORRETO | Single Responsiblity Principle (SRP).
	 *  Envolve baixo acoplamento e coes�o = cada classe tem a sua responsabilidade bem definida,
	 *  deixando mais fluido a codifica��o e mais f�cil para a manuten��o.
	 */
	
	// RESPONSABILIDADE GERAL CUIDAR DO JARDIM!
	public void cuidarJardim(){
		tirarErvaDaninhas();
		podar();
		regarPlantas();
	}
	
	// Especificar m�todos segundo suas tarefas e responsabilidades.
	public void tirarErvaDaninhas(){
		System.out.println("Estou tirando as ervas daninhas...");
	}
	
	public void podar(){
		System.out.println("Estou podando as plantas...");
	}
	
	public void regarPlantas(){
		System.out.println("Estou regando as plantas...");
	}
}
