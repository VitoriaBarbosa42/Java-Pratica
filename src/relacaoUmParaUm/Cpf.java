package relacaoUmParaUm;

public class Cpf {
	
	String numero;
	String dataEmissao;
	
	Cpf(String numero, String dataEmissao) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
	}
	
	void imprimirCPF() {
		System.out.println("CPF: " + numero + ", Emissão: " + dataEmissao);
	}

}
