package aula06.contratointerface.reino.fedora;

import java.util.ArrayList;
import java.util.List;

public abstract class Nobre {
	public Conselheiro conselheiro;
	public List<Soldado> soldados = new ArrayList<Soldado>();;
	
	public abstract void governar();
}
