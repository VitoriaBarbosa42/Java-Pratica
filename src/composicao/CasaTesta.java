package composicao;

public class CasaTesta {
	
	public static void main(String[] args) {
		
		Casa minhaCasa = new Casa();
		
		minhaCasa.porta.status();
		
		minhaCasa.abrirPorta();
		
		minhaCasa.porta.status();

		minhaCasa.fecharPorta();
		
		minhaCasa.porta.status();
		
	}

}
