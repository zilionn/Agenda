package view;

import model.Musica;
import model.Playlist;

public class Principal {

	public static void main(String[] args) {
		Musica BadRomance = new Musica("Bad Romance", "Lady Gaga", "Interscope");
		Musica Heated = new Musica("Heated", "Beyonce", "Parkwood");
		Musica PokerFace = new Musica("Poker Face", "Lady Gaga", "Interscope");
		Musica SweetDreams = new Musica("Sweet Dreams - Marilyn Manson Version", "Marilyn Manson", "Interscope");
		
		Playlist play = new Playlist("Fernando");
		
		play.adicionarMusica(BadRomance);
		play.adicionarMusica(Heated);
		play.adicionarMusica(PokerFace);
		play.adicionarMusica(SweetDreams);
		
		System.out.println(play.tocarAleatorio());
		

	}

}
