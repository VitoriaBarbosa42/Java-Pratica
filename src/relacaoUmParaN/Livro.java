package relacaoUmParaN;

public class Livro {
	
	String nomeLivro;
	String autorLivro;
	Editora editora;
	
	Livro (String livro, String autorLivro) {
		this.nomeLivro = livro;
		this.autorLivro = autorLivro;
	}
	
	void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	void exibirLivro() {
		System.out.println("--Informações do livro--");
		System.out.printf("Livro: %s%n", this.nomeLivro);
		System.out.printf("Autor: %s%n", this.autorLivro);
		if (this.editora != null) {
			System.out.println("Editora: " + this.editora.nomeEditora);
		} else {
			System.out.println("Editoria não cadastrada");
		}
	}
	
	
}
