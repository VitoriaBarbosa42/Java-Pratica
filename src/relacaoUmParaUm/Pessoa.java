package relacaoUmParaUm;

public class Pessoa {
	
	String nome;
	Cpf cpf;
	
	Pessoa(String nome, Cpf cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	void apresentar() {
		System.out.println("Nome: " + nome);
		if (cpf != null) {
			cpf.imprimirCPF();
		} else {
			System.out.println("CPF não informado.");
		}
	}

}
