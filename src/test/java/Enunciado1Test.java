import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({
            "20, 'fernando', 10, '-', 'P4'",
            "20, 'fernando', 8, '+', 'P3'",
            "20, 'fernando', 18, '-', 'P2'",
            "20, 'fernando', 30, '+', 'P1'"
    })
    void clasesEquivalentes(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo, String resultado) {
        assertEquals(resultado, enunciado1.asignaPrima(numEmpleado, nombreEmpleado, mesesTrabajo, directivo));

    }

    @ParameterizedTest
    @CsvSource({
            "-2, 'fernando', 10, '-',",
            "1111, 'fernando', 10, '-',",
            "20, 'minombreesaitor', 10, '-',",
            "20, '', 10, '-'",
            "20, 'fernando', -3, '-'",
            "20, 'fernando', 1004, '-'",
            "20, 'fernando', 1004, '*'"
    })
    void clasesEquivalentesErroneos(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) {
        assertThrows(IllegalArgumentException.class, () -> enunciado1.asignaPrima(numEmpleado, nombreEmpleado, mesesTrabajo, directivo));
    }

    @ParameterizedTest
    @CsvSource({
      "1, 'a', 0, '-', 'P4'",
      "2, 'ai', 1, '+', 'P3'",
      "998, 'aitoraitor', 998, '-', 'P2'",
      "999, 'aitoraito', 999, '+', 'P1'"
    })
    void valoresLimitesErroneos(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo, String resultado) {
        assertEquals(resultado, enunciado1.asignaPrima(numEmpleado, nombreEmpleado, mesesTrabajo, directivo));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 'fernando', 0, '-'",
            "1000, 'fernando', 0, '-'",
            "1, 'fernando', -1, '-'",
            "1, 'fernando', 1000, '-'",
            "2, '', 1, '+'",
            "2, 'aitoraitora', 1, '+'"
    })
    void valoresLimitesErroneos(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) {
        assertThrows(IllegalArgumentException.class, () -> enunciado1.asignaPrima(numEmpleado, nombreEmpleado, mesesTrabajo, directivo));
    }

}