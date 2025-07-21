package NParaM;

public class Curso {
	
	String nomeCurso;
    String codigoCurso;

    Curso(String nomeCurso, String codigoCurso) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
     }    
    void exibirNome() {
        System.out.println("  Curso: " + nomeCurso + " (Código: " + codigoCurso + ")");
    }
}
