package padroescomportamentais;

public class NotaServicoEstadoProgramado implements NotaServicoEstado{

    private NotaServicoEstadoProgramado() {};
    private static NotaServicoEstadoProgramado instance = new NotaServicoEstadoProgramado();
    public static NotaServicoEstadoProgramado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Programado";
    }
}
