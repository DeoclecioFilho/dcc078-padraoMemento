package padroescomportamentais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaServicoTest {
    NotaServico notaServico;

    @BeforeEach
    void setup(){
       notaServico = new NotaServico();
    }

    @Test
    void deveArmazenarEstados() {

        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        assertEquals(2, notaServico.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {

        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        notaServico.restauraEstado(0);
        assertEquals(NotaServicoEstadoProgramado.getInstance(), notaServico.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {

        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        notaServico.setEstado(NotaServicoEstadoFinalizado.getInstance());
        notaServico.restauraEstado(2);
        assertEquals(NotaServicoEstadoExecutado.getInstance(), notaServico.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            notaServico.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}