package padroescomportamentais;

public class NotaServicoEstadoCancelado implements NotaServicoEstado{

    private NotaServicoEstadoCancelado() {};
    private static NotaServicoEstadoCancelado instance = new NotaServicoEstadoCancelado();
    public static NotaServicoEstadoCancelado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelado";
    }
}
