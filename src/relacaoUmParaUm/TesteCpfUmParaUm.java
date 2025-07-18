package relacaoUmParaUm;

public class TesteCpfUmParaUm {
	
	public static void main(String[] args) {
		Cpf meuCpf = new Cpf("123.456.789-00", "01/01/2020");
		Pessoa minhaPessoa = new Pessoa("Maria Silva", meuCpf);
		
		minhaPessoa.apresentar();
		
		Pessoa pessoaSemCPF = new Pessoa("João Pereira", null);
		
		pessoaSemCPF.apresentar();
	}

}
