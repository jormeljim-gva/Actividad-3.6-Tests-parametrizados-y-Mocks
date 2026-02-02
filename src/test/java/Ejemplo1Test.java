import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo1Test {
    private static Ejemplo1 ejemplo1;

    @BeforeAll
    static void beforeAll() {
        ejemplo1 = new Ejemplo1();
    }

    @AfterAll
    static void afterAll() {
        ejemplo1 = null;
    }

    @ParameterizedTest
    @ValueSource(ints={65, 50, 51, 90, 89})
    void admitidos(int porcentaje){
        assertEquals("SI", ejemplo1.esAdmitido(porcentaje));
    }

    @ParameterizedTest
    @ValueSource(ints={33, 99, 49, 91})
    void noAdmitidos(int porcentaje){
        assertEquals("NO", ejemplo1.esAdmitido(porcentaje));
    }
}