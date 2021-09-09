package solid.principio01.SRP;

public class FuncionarioViolacaoSRP {  	
	/*
	 *  INCORRETO | Violação Single Responsiblity Principle (SRP).
	 *  Dificulta o reaproveitamento do código e os testes automatizados.
	 *  Por não separar os comportamentos as mudanças no código podem afetar outros comportamentos não relacionados,
	 *  gerando erros e dificultando a manutenção.
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
