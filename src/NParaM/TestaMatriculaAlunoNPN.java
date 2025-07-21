package NParaM;

public class TestaMatriculaAlunoNPN {
	public static void main(String[] args) {
		
		GerenciadorAcademico sistema = new GerenciadorAcademico();

        Aluno a1 = new Aluno("Pedro", 101);
        Aluno a2 = new Aluno("Paula", 102);
        Aluno a3 = new Aluno("Fernando", 103);

        Curso c1 = new Curso("Programação Java", "JAVA001");
        Curso c2 = new Curso("Banco de Dados SQL", "SQL002");
        Curso c3 = new Curso("Desenvolvimento Web", "WEB003");
        
        sistema.adicionarAluno(a1);
        sistema.adicionarAluno(a2);
        sistema.adicionarAluno(a3);

        sistema.adicionarCurso(c1);
        sistema.adicionarCurso(c2);
        sistema.adicionarCurso(c3);
        
        sistema.matricularAlunoEmCurso(a1, c1, "2024-03-01");
        sistema.matricularAlunoEmCurso(a1, c2, "2024-03-05"); // Pedro em mais de um curso
        sistema.matricularAlunoEmCurso(a2, c1, "2024-03-02"); // Paula no mesmo curso que Pedro
        sistema.matricularAlunoEmCurso(a3, c3, "2024-03-10");

        sistema.listarMatriculas();
        sistema.listarCursosDoAluno(a1);
        sistema.listarAlunosNoCurso(c1);
		
	}

}
