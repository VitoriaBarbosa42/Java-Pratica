package NParaM;

public class Filme {
	
	String titulo;
	String ano;
	
	Filme (String titulo, String ano) {
		this.titulo = titulo;
		this.ano = ano;
	}

}

//Crie uma classe Ator e uma classe Filme. Um Ator pode atuar em vários Filmes, e um Filme pode ter vários Atores. 
//Crie uma classe intermediária Participacao que conecte Ator e Filme, e que possa registrar o papel que o ator teve naquele filme. 
//Implemente a lógica para adicionar atores e filmes, e para listar quais filmes um ator participou e quais atores 
//estão em um determinado filme.