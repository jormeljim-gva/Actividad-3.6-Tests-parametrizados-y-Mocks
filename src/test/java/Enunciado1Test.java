import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Enunciado1Test {
    private static Enunciado1 enunciado1;

    @BeforeAll
    static void beforeAll(){
        enunciado1 = new Enunciado1();
    }

    @AfterAll
    static void afterAll(){
        enunciado1 = null;
    }

    @Test
    void clasesEquivalencia() {
        assertEquals("P4", enunciado1.asignaPrima(20, "fernando", 10, '-'));
        assertEquals("P3", enunciado1.asignaPrima(20, "fernando", 8, '+'));
        assertEquals("P2", enunciado1.asignaPrima(20, "fernando", 18, '-'));
        assertEquals("P1", enunciado1.asignaPrima(20, "fernando", 30, '+'));

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(-2, "fernando", 10, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(1111, "fernando", 10, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(20, "minombreesaitor", 10, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(20, "", 10, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(20, "fernando", -3, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(20, "fernando", 1004, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(20, "fernando", 1004, '*');
        });
    }

    @Test
    void valoresLimites(){
        assertEquals("P4", enunciado1.asignaPrima(1, "a", 0, '-'));
        assertEquals("P3", enunciado1.asignaPrima(2, "ai", 1, '+'));
        assertEquals("P2", enunciado1.asignaPrima(998, "aitoraitor", 998, '-'));
        assertEquals("P1", enunciado1.asignaPrima(999, "aitoraito", 999, '+'));

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(0, "fernando", 0, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(1000, "fernando", 0, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(1, "fernando", -1, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(1, "fernando", 1000, '-');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(2, "", 1, '+');
        });

        assertThrows(IllegalArgumentException.class, () -> {
            enunciado1.asignaPrima(2, "aitoraitora", 1, '+');
        });

    }

}