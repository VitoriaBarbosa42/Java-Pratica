package relacaoUmParaN;

public class Funcionario {
	
	String nome;
	String cargo;
	
	Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}
	
	void imprimirDetalhes() {
		System.out.println(" - " + nome + " (" + cargo + ") ");
	}

}
