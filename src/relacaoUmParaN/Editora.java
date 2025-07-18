package relacaoUmParaN;

import java.util.ArrayList;
import java.util.List;

public class Editora {
	
	String nomeEditora;
	List <Livro> livros;
	
	Editora (String nomeEditoria) {
		this.nomeEditora = nomeEditoria;
		this.livros = new ArrayList<Livro>();
	}
	
	void adicionarLivro (Livro livro) {
		this.livros.add(livro);
		livro.setEditora(this);
		System.out.println("Livro '" + livro.nomeLivro + "' adicionado na editora '" 
		+ this.nomeEditora + "'.");
	}
	
	void removerLivro(Livro livro) {
		if (this.livros.remove(livro)) {
			System.out.println(livro.nomeLivro + " Removido da Editora " + this.nomeEditora);
		} else {
			System.out.println(livro.nomeLivro + " Não encontrado");
		}
	}	
	
	
	void listarLivros () {
		System.out.println("\n --Livro Publicados pela Editora " + this.nomeEditora + "--" );
		if (livros.isEmpty()) {
			System.out.println("A editora " + nomeEditora + " ainda não publicou nenhum livro");
		} else {
			for (Livro livro : livros) {
				livro.exibirLivro();
			}
		}
	
	
	}
		
}
