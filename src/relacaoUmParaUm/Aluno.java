package relacaoUmParaUm;

public class Aluno {
	
	String nome;
	int idade;
	Matricula matricula;
	
	
	Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;		
	}
	
	void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
	
	void exibirDetalhes() {
		System.out.println("Aluno: " + nome + " Idade: " + idade);
	}
	

}
