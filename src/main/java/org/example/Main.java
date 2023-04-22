package org.example;

import org.example.model.ContatoModel;
import org.example.service.AgendaService;

import java.util.List;

public class Main {

        public static void main(String[] args) {
            AgendaService agenda = new AgendaService();
            ContatoModel contato1 = new ContatoModel(1L, "João", "joao@email.com", "10000000");
            ContatoModel contato2 = new ContatoModel(2L, "Maria", "maria@email.com", "000000000");
            agenda.adicionarContato(contato1);
            agenda.adicionarContato(contato2);

            List<ContatoModel> contatos = agenda.listarContatos();
            for (ContatoModel contato : contatos) {
                System.out.println("ID: " + contato.getId());
                System.out.println("Nome: " + contato.getNome());
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("---------------------------");
            }
        }
    }
