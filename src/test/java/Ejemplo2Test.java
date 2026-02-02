import org.junit.jupiter.api.*;

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

    @Test
    void clasesEquivalencia() {
        assertEquals("SI", ejemplo2.esAdmitido("apto"));
        assertEquals("NO", ejemplo2.esAdmitido("no apto"));
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo2.esAdmitido("otro");
        });

    }


}