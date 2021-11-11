package persistence;

import java.util.List;

import entity.Pet;

public interface IPetDao {
	
	public void adicionar(Pet p);
	public List<Pet> listarPorNome(String nome);
	public void remover(long id);
	public void atualizar(long id, Pet p);

}
