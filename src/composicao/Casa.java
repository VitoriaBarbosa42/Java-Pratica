package composicao;

public class Casa {
	
	Porta porta;
	
	Casa() {
		this.porta = new Porta();
	}
	
	void abrirPorta() {
		porta.abrir();
		System.out.println("Abrindo a porta");
	}

	void fecharPorta() {
		porta.fechar();
		System.out.println("Fechando a porta");
	}
	
}
