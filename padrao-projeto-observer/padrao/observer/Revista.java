package padrao.observer;

import java.util.ArrayList;
import java.util.List;

public class Revista implements Publicadora {

	private List<Assinante> assinantes = new ArrayList<>();

	@Override
	public void adicionar(Assinante a) {
		assinantes.add(a);
	}

	@Override
	public void remover(Assinante a) {
		assinantes.remove(a);
	}

	@Override
	public void encaminhar(String publicacao) {
		// assinantes.stream().forEach((a) -> {
		// a.receberPublicacao( publicacao );
		// });
		for (Assinante a : assinantes) {
			a.receberNoticia(publicacao);
		}
	}

}
