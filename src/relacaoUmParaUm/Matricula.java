package relacaoUmParaUm;

public class Matricula {
	
	String numMatricula;
	String dataMatricula;
	Aluno aluno;
	
	Matricula(String numMatricula, String dataMatricula, Aluno aluno) {
		this.numMatricula = numMatricula;
		this.dataMatricula = dataMatricula;
		this.aluno = aluno;
	}
	
	void exibirInformacoes () {
		System.out.println("__Dados do Cadastro__");
		aluno.exibirDetalhes();
		System.out.println("Matricula: " + numMatricula);
		System.out.println("Data da Matricula: " + dataMatricula);
	}
	

}
