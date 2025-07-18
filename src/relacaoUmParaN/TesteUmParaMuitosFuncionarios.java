package relacaoUmParaN;

public class TesteUmParaMuitosFuncionarios {
	
	public static void main(String[] args) {
		
        Departamento rh = new Departamento("Recursos Humanos");
        Departamento ti = new Departamento("Tecnologia da Informação");
		
        Funcionario f1 = new Funcionario("Ana", "Analista RH");
        Funcionario f2 = new Funcionario("Bruno", "Coordenador RH");
        Funcionario f3 = new Funcionario("Carlos", "Desenvolvedor Backend");
        Funcionario f4 = new Funcionario("Daniela", "DevOps");
        
        rh.adicionarFuncionario(f1);
        rh.adicionarFuncionario(f2);
        ti.adicionarFuncionario(f3);
        ti.adicionarFuncionario(f4);
        
        rh.listarFuncionarios();
        ti.listarFuncionarios();
        
        rh.removerFuncionaro(f1);
        rh.listarFuncionarios();
	}

}
