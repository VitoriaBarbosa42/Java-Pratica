package relacaoUmParaN;

public class TesteUmParaNEditora {
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro ("1984", "George Orwell");
		Livro livro2 = new Livro ("Dom Quixote", "Miguel de Cervantes");
		Livro livro3 = new Livro ("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
		Livro livro4 = new Livro ("Crime e Castigo", "Fyodor Dostoevsky");
		Livro livro5 = new Livro ("A Metamorfose", "Franz Kafka");
		
		Editora editora1 = new Editora ("Falcão");
		Editora editora2 = new Editora ("Gazeta");
		
		editora1.adicionarLivro(livro1);
		editora1.adicionarLivro(livro2);
		editora1.adicionarLivro(livro3);
		editora2.adicionarLivro(livro4);
		editora2.adicionarLivro(livro5);
		
		
		editora1.listarLivros();
		editora2.listarLivros();		
	}

}
