package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
    private List<Musica> musicas;
    private String dono;

    public Playlist(String dono, Musica musica) {
        this.musicas = new ArrayList<>();
        this.dono = dono;
        musicas.add(musica);
    }
    
    public Playlist(String dono) {
        this.musicas = new ArrayList<>();
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public String tocarMusica() {
        if (musicas.isEmpty()) {
            return "playlist vazia :( adicione músicas primeiro";
        }
        return musicas.get(0).getNome();
    }

    public String tocarAleatorio() {
        if (musicas.isEmpty()) {
            return "playlist vazia :( adicione músicas primeiro";
        }
        int tamanho = musicas.size();
        Random r = new Random();
        int aleatorio = r.nextInt(tamanho);
        return musicas.get(aleatorio).getNome();
    }
}