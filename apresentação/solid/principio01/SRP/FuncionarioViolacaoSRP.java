package solid.principio01.SRP;

public class FuncionarioViolacaoSRP {  	
	/*
	 *  INCORRETO | Viola��o Single Responsiblity Principle (SRP).
	 *  Dificulta o reaproveitamento do c�digo e os testes automatizados.
	 *  Por n�o separar os comportamentos as mudan�as no c�digo podem afetar outros comportamentos n�o relacionados,
	 *  gerando erros e dificultando a manuten��o.
	 */
	

	public void dirigirCarro() { 
		// Responsabilidade => MOTORISTA
	}

	public void cozinhar() { 
		// Responsabilidade => COZINHEIRO
	}

	public void cuidarJardim() { 
		// Responsabilidade => JARDINEIRO
	}

	public void pintar() {
		// Responsabilidade => PINTOR
	}
	
}
