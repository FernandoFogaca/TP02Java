import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraReembolsoTest {

    @Test
    public void testeReembolsoBasico() {

        CalculadoraReembolso calc = new CalculadoraReembolso();
        Paciente paciente = new Paciente("nome");

        double resultado = calc.calculaReembolso(paciente, 200, 70);

        assertEquals(140, resultado);
    }

    @Test
    public void consultaZero() {

        CalculadoraReembolso calc = new CalculadoraReembolso();
        Paciente paciente = new Paciente("nome");

        double resultado = calc.calculaReembolso(paciente, 0, 70);

        assertEquals(0, resultado);
    }

    @Test
    public void coberturaZero() {

        CalculadoraReembolso calc = new CalculadoraReembolso();
        Paciente paciente = new Paciente("nome");

        double resultado = calc.calculaReembolso(paciente, 200, 0);

        assertEquals(0, resultado);
    }

    @Test
    public void coberturaTotal() {

        CalculadoraReembolso calc = new CalculadoraReembolso();
        Paciente paciente = new Paciente("nome");

        double resultado = calc.calculaReembolso(paciente, 200, 100);

        assertEquals(150, resultado);
    }
    
    @Test
    public void testeAutorizadorMock() {

        AutorizadorMock mock = new AutorizadorMock(false);

        boolean resultado = mock.autorizar();

        assertEquals(false, resultado);
    }
    
    

}