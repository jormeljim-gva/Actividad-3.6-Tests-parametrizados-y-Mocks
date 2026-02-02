import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo3Test {
    private static Ejemplo3 ejemplo3;

    @BeforeAll
    static void beforeAll(){
        ejemplo3 = new Ejemplo3();
    }

    @AfterAll
    static void afterAll(){
        ejemplo3 = null;
    }

    @Test
    void clasesEquivalencia() {
        assertEquals(18, ejemplo3.calcula(12, 6, '+'));
        assertEquals(6, ejemplo3.calcula(12, 6, '-'));
        assertEquals(2, ejemplo3.calcula(12, 6, '/'));
        assertEquals(72, ejemplo3.calcula(12, 6, '*'));
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(-4, 5, '+');
        });
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(1002, 5, '+');
        });
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(6, -5, '+');
        });
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(6, 1222, '+');
        });
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(6, 5, '?');
        });
    }

    @Test
    void valoresLimites() {
        assertEquals(2, ejemplo3.calcula(1, 1, '+'));
        assertEquals(0, ejemplo3.calcula(2, 2, '-'));
        assertEquals(1, ejemplo3.calcula(999, 999, '/'));
        assertEquals(996004, ejemplo3.calcula(998, 998, '*'));
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(0, 1, '+');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(1000, 1, '+');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(1, 0, '+');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(1, 1000, '+');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(1, 1, '?');
        });
    }


}