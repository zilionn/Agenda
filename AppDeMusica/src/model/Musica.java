package model;

public class Musica {
	
	private String nome;
	private String autor;
	private String gravadora;
	
	public Musica(String nome, String autor, String gravadora) {
		this.nome = nome;
		this.autor = autor;
		this.gravadora = gravadora;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getAutor() {
		return autor;
	}

	public final void setAutor(String autor) {
		this.autor = autor;
	}

	public final String getGravadora() {
		return gravadora;
	}

	public final void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

}
