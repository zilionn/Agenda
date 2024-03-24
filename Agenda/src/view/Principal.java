package view;

import java.util.List;

import model.AgendaTelefonica;
import model.Contato;

public class Principal {
	public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.adicionarContato(new Contato("João", "000000000", "lala@lala.com"));
        agenda.adicionarContato(new Contato("Fernando", "000000001", "lele@lulu.com"));
        agenda.adicionarContato(new Contato("João", "000000010", "lady@gaga.com"));

        List<Contato> contato = agenda.buscarContatos("João");
        for(Contato pessoa : contato) {
        	System.out.println(pessoa.getNome());
        	System.out.println(pessoa.getTelefone());
        }
        
        agenda.removerContatos("João");
        
        List<Contato> contatoRemovido = agenda.buscarContatos("João");
        if (contatoRemovido.isEmpty()) {
            System.out.println("Contatos foi removido ou não foi encontrado");
        }
    }
}


