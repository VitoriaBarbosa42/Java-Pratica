package NParaM;

public class Matricula {
	
	Aluno aluno;
    Curso curso;
    String dataMatricula;
    
    Matricula(Aluno aluno, Curso curso, String dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }
    
    void exibirDetalhesMatricula() {
        System.out.println("\nDetalhes da Matrícula:");
        System.out.println("  Aluno: " + aluno.nome);
        System.out.println("  Curso: " + curso.nomeCurso);
        System.out.println("  Data da Matrícula: " + dataMatricula);
    }

}
