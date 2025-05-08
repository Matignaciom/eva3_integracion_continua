package src.test.java;

public class HolaMundoTest {
    @Test
    public void testHolaMundo() {
        // Esta es una prueba simple para demostrar la estructura
        assertEquals(1, 1);
    }

    private void assertEquals(int i, int j) {
        if (i != j) {
            throw new AssertionError("Se esperaba " + i + " pero se obtuvo " + j);
        }
        throw new UnsupportedOperationException("Método 'assertEquals' no implementado");
    }
}
