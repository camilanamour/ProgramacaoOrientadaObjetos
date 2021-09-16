package aula05.alunos;

public class Aluno {
	String nascimento;
	String ra;
	String nome;
	
	@Override
	public String toString(){
		return "Nascimento: "+nascimento+"\t| RA: "+ra+"\t| Nome: "+nome;
	}

}
