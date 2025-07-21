package NParaM;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAcademico {
	
	List<Aluno> alunos;
    List<Curso> cursos;
    List<Matricula> matriculas;
    
    GerenciadorAcademico() {
		this.alunos = new ArrayList<>();
		this.cursos = new ArrayList<>();
		this.matriculas = new ArrayList<>();
	}
    
    void adicionarAluno(Aluno aluno) {
    	this.alunos.add(aluno);
    	System.out.println("Aluno " + aluno.nome + " adicionado.");
    }
    
    void adicionarCurso(Curso curso) {
    	this.cursos.add(curso);
    	System.out.println("Curso " + curso.nomeCurso + " adicionado.");
    }
    
    void matricularAlunoEmCurso(Aluno aluno, Curso curso, String dataMatricula) {
        Matricula novaMatricula = new Matricula(aluno, curso, dataMatricula);
        this.matriculas.add(novaMatricula);
        System.out.println("Aluno " + aluno.nome + " matriculado em " + curso.nomeCurso + " em " + dataMatricula);
    }
    
    void listarMatriculas() {
        System.out.println("\n--- Todas as Matrículas ---");
        if (matriculas.isEmpty()) {
            System.out.println("Nenhuma matrícula registrada.");
            return;
        }
        for (Matricula m : matriculas) {
            m.exibirDetalhesMatricula();
        }    
    }
    
    void listarCursosDoAluno(Aluno aluno) {
    	System.out.println("\nCursos do Alino" + aluno.nome + ":");
    	boolean encontrou = false;
    	for (Matricula m : matriculas) {
    		if (m.aluno.equals(aluno)) {
    			m.curso.exibirNome();
    			encontrou = true;
    		}
    		if (!encontrou) {
    			System.out.println("  Nenhum curso encontrado para esse aluno.");
    		}
    	}
    }
    
        void listarAlunosNoCurso(Curso curso) {
            System.out.println("\nAlunos no Curso " + curso.nomeCurso + ":");
            boolean encontrou = false;
            for (Matricula m : matriculas) {
                if (m.curso.equals(curso)) { // Compara se é o mesmo objeto Curso
                    m.aluno.exibirNome();
                    encontrou = true;
                }
            }
            if (!encontrou) {
                System.out.println("  Nenhum aluno matriculado neste curso.");
            }	
    
    }
    
    
    

}
