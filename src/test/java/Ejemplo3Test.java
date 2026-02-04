import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({"12, 6, '+', 18",
            "12, 6, '-', 6",
            "12, 6, '/', 2",
            "12, 6, '*', 72"
    })
    void clasesEquivalentes(int numero, int numero2, char operador, int resultado) {
        assertEquals(resultado, ejemplo3.calcula(numero, numero2, operador));
    }

    @ParameterizedTest
    @CsvSource({"-4, 5, '+'",
            "1002, 5, '+'",
            "6, -5, '+'",
            "6, 1222, '+'",
            "6, 5, '?'"
    })
    void clasesEquivalentesErroneos(int numero, int numero2, char operador) {
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(numero, numero2, operador);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, '+', 2",
            "2, 2, '-', 0",
            "999, 999, '/', 1",
            "998, 998, '*', 996004"
    })
    void valoresLimite(int numero, int numero2, char operador, int resultado){
        assertEquals(resultado, ejemplo3.calcula(numero, numero2, operador));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, '+'",
            "1000, 1, '+'",
            "1, 0, '+'",
            "1, 1000, '+'",
            "1, 1, '?'"
    })
    void valoresLimiteErroneos(int numero, int numero2, char operador){
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo3.calcula(numero, numero2, operador);
        });
    }

}