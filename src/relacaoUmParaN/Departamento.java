package relacaoUmParaN;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	
	String nomeDepartamento;
	List <Funcionario> funcionarios;
	
	Departamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		System.out.println(funcionario.nome + 
				" adicionado ao departamento " + this.nomeDepartamento);
	}
	
	void removerFuncionaro(Funcionario funcionario) {
		if (this.funcionarios.remove(funcionario)) {
			System.out.println(funcionario.nome + "removido do departamento " 
					+ this.nomeDepartamento);
		} else {
			System.out.println(funcionario.nome + " não encontrado neste departamento.");
		}
	}
	
	void listarFuncionarios() {
		System.out.println("\nFuncionarios do departamento " + this.nomeDepartamento + ":");
		if (funcionarios.isEmpty()) {
			System.out.println(" Nenhum funcionário neste departamento.");
		} else {
			for (Funcionario f : funcionarios) {
				f.imprimirDetalhes();
				
			}
		}
	
	}
	

}
