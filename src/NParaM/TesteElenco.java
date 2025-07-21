package NParaM;

public class TesteElenco {
	
	public static void main(String[] args) {
		
		
		Filme avatar = new Filme ("Avatar", "2009");
		Filme corra = new Filme ("Corra", "2017");
		
		
		Ator ator1 = new Ator("Daniel Kaluuya", 36);
		Ator ator2 = new Ator("Allison Williams", 37);
		
		Ator ator3 = new Ator("Zoë Saldaña", 47);
		Ator ator4 = new Ator("Sam Worthington", 48);
		
		Ator ator5 = new Ator("fake", 44);
		
		Participacao elenco1 = new Participacao(avatar);
		elenco1.adicionarPersonagens("Jake Sully, Tommy", ator4);
		elenco1.adicionarPersonagens("Neytiri", ator3);
		elenco1.adicionarPersonagens("xyz", ator5);
		
		elenco1.listaElenco();
		
		Participacao elenco2 = new Participacao(corra);
		
		elenco2.listaElenco();
		elenco2.adicionarPersonagens("Rose Armitage", ator2);
		elenco2.adicionarPersonagens("Chris Washington", ator1);
		elenco2.adicionarPersonagens("xyz", ator5);
		elenco2.listaElenco();
		
		elenco1.apagarItem("xyz");
		elenco2.apagarItem("xyzs");
		elenco1.listaElenco();
		elenco2.listaElenco();
		
		
	}
	
	

}
