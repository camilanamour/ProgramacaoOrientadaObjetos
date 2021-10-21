package padrao.observer;

public interface Publicadora {
	void adicionar(Assinante a);
	void remover(Assinante a);
	void encaminhar(String publicação);
	
}
