package padroescomportamentais;

public class NotaServicoEstadoFinalizado implements NotaServicoEstado{
    private NotaServicoEstadoFinalizado() {};
    private static NotaServicoEstadoFinalizado instance = new NotaServicoEstadoFinalizado();
    public static NotaServicoEstadoFinalizado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Fianalizado";
    }
}
