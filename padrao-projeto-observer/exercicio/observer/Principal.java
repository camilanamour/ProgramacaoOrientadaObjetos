package exercicio.observer;

public class Principal {
	public static void main(String[] args) {
		
		Leitor joao = new Leitor();
		SuperInteressante s = new SuperInteressante();
		
		s.registrar(joao);
		s.publicarArtigo(s.artigo());
	}
}
