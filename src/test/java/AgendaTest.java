import org.example.model.ContatoModel;
import org.example.service.AgendaService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgendaTest {

    @Test
    public void testAdicionarContato() {
        AgendaService agenda = new AgendaService();
        ContatoModel contato = new ContatoModel(1L, "João", "1234-5678", "299999999");
        agenda.adicionarContato(contato);
        assertEquals(1L, agenda.listarContatos().size());
    }

    @Test
    public void testRemoverContato() {
        AgendaService agenda = new AgendaService();
        ContatoModel contato = new ContatoModel(1L, "João", "1234-5678", "19999999");
        agenda.adicionarContato(contato);
        agenda.removerContato(1L);
        assertEquals(0, agenda.listarContatos().size());
    }

    @Test
    public void testListarContatos() {
        AgendaService agenda = new AgendaService();
        ContatoModel contato1 = new ContatoModel(1L, "João", "1234-5678", "19999999");
        ContatoModel contato2 = new ContatoModel(2L, "Maria", "5678-9012", "1999999");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        assertEquals(2, agenda.listarContatos().size());
    }

    @Test
    public void testBuscarContatosPorNome() {
        AgendaService agenda = new AgendaService();
        ContatoModel contato1 = new ContatoModel(1L, "João", "1234-5678", "200000000");
        ContatoModel contato2 = new ContatoModel(2L, "Maria", "5678-9012", "9999999999");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        assertEquals(1, agenda.buscarContatosPorNome("João").size());
    }

    @Test
    public void testBuscarContatoPorId() {
        AgendaService agenda = new AgendaService();
        ContatoModel contato1 = new ContatoModel(1L, "João", "1234-5678", "222222222");
        ContatoModel contato2 = new ContatoModel(2L, "Maria", "5678-9012", "33333333");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        assertEquals("Maria", agenda.buscarContatoPorId(2L).getNome());
    }
}