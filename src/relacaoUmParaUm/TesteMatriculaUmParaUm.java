package relacaoUmParaUm;

public class TesteMatriculaUmParaUm {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Tereza", 18);
		Aluno aluno2= new Aluno("Maria", 19);
		Aluno aluno3 = new Aluno("Luana", 20);
		
		Matricula matricula1 = new Matricula("352251", "13/12/2024", aluno1);
		Matricula matricula2 = new Matricula("355148", "20/12/2024", aluno2);
		Matricula matricula3 = new Matricula("215442", "31/12/2024", aluno3);
		
		matricula1.exibirInformacoes();
		matricula2.exibirInformacoes();
		matricula3.exibirInformacoes();
		
		
	}

}
