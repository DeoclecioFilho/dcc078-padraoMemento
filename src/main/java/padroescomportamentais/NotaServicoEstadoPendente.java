package padroescomportamentais;

public class NotaServicoEstadoPendente implements NotaServicoEstado{

    private NotaServicoEstadoPendente() {};
    private static NotaServicoEstadoPendente instance = new NotaServicoEstadoPendente();
    public static NotaServicoEstadoPendente getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pendente";
    }
}
