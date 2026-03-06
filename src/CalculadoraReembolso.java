public class CalculadoraReembolso {

    public double calculaReembolso(Paciente paciente, double valorConsulta, double cobertura) {

        double result = valorConsulta * cobertura / 100;

        if(result > 150){
            result = 150;
        }

        return result;
    }

}