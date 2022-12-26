package padroescomportamentais;

public class NotaServicoEstadoExecutado implements NotaServicoEstado{
    private NotaServicoEstadoExecutado() {};
    private static NotaServicoEstadoExecutado instance = new NotaServicoEstadoExecutado();
    public static NotaServicoEstadoExecutado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Executado";
    }
}
