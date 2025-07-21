package NParaM;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Participacao {
	
	Filme titulo;
	Ator nomeAtor;
	Map<String, Ator> papeis;
	
	Participacao(Filme titulo) {
		this.titulo = titulo;
		papeis = new HashMap<String, Ator>();
	}

	void adicionarPersonagens(String nomePersonagem, Ator nomeAtor) {
		papeis.put(nomePersonagem, nomeAtor);
	}
	
	void listaElenco() {
		if(papeis.size() != 0) {
			for (Entry<String, Ator> elenco: papeis.entrySet()) {
				System.out.print("Personagem: " + elenco.getKey() + " | Ator: " + elenco.getValue().nomeAtor + "\n");
			}
		} else {
			System.out.println("Não há atores cadastrados nesse filme.");
		}
	}
	
	void apagarItem(String item) {
		if (papeis.size() != 0 && papeis.containsKey(item)) {
				papeis.remove(item);
				System.out.println(item + " Removido com sucesso");
			} else {
			System.out.println(item + " não encontrado");
			}
		}
}
