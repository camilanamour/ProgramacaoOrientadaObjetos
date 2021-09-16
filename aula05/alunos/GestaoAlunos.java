package aula05.alunos;

import java.util.Scanner;

public class GestaoAlunos {
	int indice;
	Aluno[] alunos;
	Scanner scan;

	public GestaoAlunos() {
		alunos = new Aluno[50];
		indice = 0;
		scan = new Scanner(System.in);
	}

	public void criar() {
		Aluno aluno = new Aluno();
		System.out.println("Digite o nascimento do aluno:");
		aluno.nascimento = scan.nextLine();
		System.out.println("Digite o RA do aluno:");
		aluno.ra = scan.nextLine();
		System.out.println("Digite o nome do aluno:");
		aluno.nome = scan.nextLine();
		alunos[indice] = aluno;
		indice++;
	}

	public void atualizar() {
		System.out.println("Digite o RA do aluno:");
		String ra = scan.nextLine();
		int tamanho = alunos.length;
		for(int i=0; i<tamanho; i++){
			if(alunos[i] == null) break;
			if(alunos[i].ra.equals(ra)){
				System.out.println("Digite novo nome do aluno: | Anterior: " + alunos[i].nome);
				alunos[i].nome = scan.nextLine();
				System.out.println("Digite o nascimento do aluno: | Anterior: " + alunos[i].nascimento);
				alunos[i].nascimento = scan.nextLine();
				break;
			}
		}
	}
	
	public void excluir() {
		System.out.println("Digite o RA do aluno:");
		String ra = scan.nextLine();
		int tamanho = alunos.length;
		for(int i=0; i<tamanho; i++){
			if(alunos[i] == null) break;
			if(alunos[i].ra.equals(ra)){
				alunos[i] = null;
				for(int j=i; j<tamanho; j++){
					alunos[j] = alunos[j+1];
					if(alunos[j+1] == null) break;
				}
				indice--;
				break;
			}
		}
	}
	
	public void exibir() {
		System.out.println("Digite o RA do aluno:");
		String ra = scan.nextLine();
		for(Aluno aluno: alunos){
			if(aluno == null) break;
			if(aluno.ra.equals(ra)){
				System.out.println(aluno.toString());
				break;
			}
		}
	}
	
	public void menu() {
		while(true){
			System.out.println("\n(C)riar  \t(E)xibir  \t(R)emover");              
            System.out.println("(A)tualizar  \t(S)air");
            
            String opcao = scan.nextLine().toUpperCase();
            char letra = opcao.charAt(0);
            
            switch(letra){
            case 'C': this.criar(); break;
            case 'A': this.atualizar(); break;
            case 'R': this.excluir(); break;
            case 'E': this.exibir(); break;
            case 'S': System.exit(0); break;
            default: System.out.println("Opção Inválida.");
            }
		}
	}
}
