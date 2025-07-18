package composicao;

public class Porta {
	
	boolean aberta = false;
	
	boolean abrir() {
		return aberta = true;
	}

	boolean fechar() {
		return aberta = false;		
	}
	
	void status() {
		System.out.println("A porta esta aberta: " + aberta);
	}

}
