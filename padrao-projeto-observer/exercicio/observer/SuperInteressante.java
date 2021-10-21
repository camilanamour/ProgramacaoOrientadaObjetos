package exercicio.observer;

import java.util.ArrayList;
import java.util.List;

public class SuperInteressante implements Subject, Revista {
	
	private List<Observer> lista = new ArrayList<Observer>();
	
	public void publicarArtigo(String artigo){
		notificar();		
	}

	@Override
	public String artigo() {
		return "Fatec ZL faz parceria com o MIT para "
				+ "desenvolvimento de novas tecnologias";
	}

	@Override
	public void notificar() {
		SuperInteressante s = new SuperInteressante();
		for(Observer o : lista){
			o.update(s);
		}
		
	}

	@Override
	public void registrar(Observer o) {
		lista.add(o);
	}
}
