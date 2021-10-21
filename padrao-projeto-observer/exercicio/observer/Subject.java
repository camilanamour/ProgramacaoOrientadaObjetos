package exercicio.observer;

public interface Subject {
	// Publicador
	public void notificar();
	public void registrar(Observer o);
}
