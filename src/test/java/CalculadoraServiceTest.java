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


}