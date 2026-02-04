import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo2Test {

    private static Ejemplo2 ejemplo2;

    @BeforeAll
    static void beforeAll() {
        ejemplo2 = new Ejemplo2();
    }

    @AfterAll
    static void afterAll() {
        ejemplo2 = null;
    }

    @ParameterizedTest
    @CsvSource({"apto, SI", "no apto, NO"})
    void esAdmitido(String apto, String resultado) {
        assertEquals(resultado, ejemplo2.esAdmitido(apto));
    }

    @ParameterizedTest
    @ValueSource (strings={"otro", "PP", "hola"})
    void noEsAdmitido(String apto){
        assertThrows(IllegalArgumentException.class, () -> ejemplo2.esAdmitido(apto));
    }

}