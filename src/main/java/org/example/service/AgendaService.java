package org.example.service;
import org.example.model.ContatoModel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgendaService {

        private List<ContatoModel> contatos = new ArrayList<>();

        public void adicionarContato(ContatoModel contato) {
            contatos.add(contato);
        }

        public void removerContato(Long id) {
            contatos.removeIf(contato -> contato.getId() == id);
        }

        public List<ContatoModel> listarContatos() {
            return contatos;
        }

        public List<ContatoModel> buscarContatosPorNome(String nome) {
            return contatos.stream()
                    .filter(contato -> contato.getNome().equalsIgnoreCase(nome))
                    .collect(Collectors.toList());
        }

        public ContatoModel buscarContatoPorId(Long id) {
            return contatos.stream()
                    .filter(contato -> contato.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
    }
