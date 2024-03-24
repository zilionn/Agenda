package model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContatos(String nome) {
        List<Contato> contatosRemover = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatosRemover.add(contato);
            }
        }
        contatos.removeAll(contatosRemover);
    }

    public List<Contato> buscarContatos(String nome) {
        List<Contato> contatosEncontrados = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }
}
