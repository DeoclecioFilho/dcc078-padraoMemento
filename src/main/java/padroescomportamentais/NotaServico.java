package padroescomportamentais;

import java.util.ArrayList;
import java.util.List;

public class NotaServico {

    private NotaServicoEstado estado;
    private List<NotaServicoEstado> memento = new ArrayList<NotaServicoEstado>();

    public NotaServicoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(NotaServicoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<NotaServicoEstado> getEstados() {
        return this.memento;
    }
}

