import java.util.ArrayList;
import java.util.List;

public class HistoricoConsultasFake implements HistoricoConsultas {

    private List<Double> consultas = new ArrayList<>();

    public void adicionarConsulta(double valor) {
        consultas.add(valor);
    }

    public int quantidade() {
        return consultas.size();
    }

}