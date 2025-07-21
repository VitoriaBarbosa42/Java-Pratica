package NParaM;

public class Aluno {
	
	String nome;
	int matriculaID;
	
	Aluno(String nome, int matriculaID) {
		this.nome = nome;
        this.matriculaID = matriculaID;
	}
	
	void exibirNome () {
		System.out.println(" Aluno: " + nome + "(ID: " + matriculaID + ")");
	}

}
