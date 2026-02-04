import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraServiceTest {

    @Test
    public void testDobleDeLaSuma() {
        Calculadora mockCalculadora = mock(Calculadora.class);

        when(mockCalculadora.sumar(3, 2)).thenReturn(5);
        when(mockCalculadora.multiplicar(5, 2)).thenReturn(10);



        CalculadoraService service = new CalculadoraService(mockCalculadora);
        assertEquals(10, service.dobleDeLaSuma(3, 2));
    }

    @Test
    public void testRestaAlCuadrado() {
        Calculadora mockCalculadora = mock(Calculadora.class);
        when(mockCalculadora.restar(3, 2)).thenReturn(1);
        when(mockCalculadora.multiplicar(1, 1)).thenReturn(1);

        CalculadoraService service = new CalculadoraService(mockCalculadora);
        assertEquals(1, service.restaAlCuadrado(3,2));
    }

    @Test
    public void testSumaYDivide() {
        Calculadora mockCalculadora = mock(Calculadora.class);
        when(mockCalculadora.sumar(4, 2)).thenReturn(6);
        when(mockCalculadora.dividir(6, 2)).thenReturn(3);

        CalculadoraService service = new CalculadoraService(mockCalculadora);
        assertEquals(3, service.sumaYDivide(4, 2, 2));
    }


}