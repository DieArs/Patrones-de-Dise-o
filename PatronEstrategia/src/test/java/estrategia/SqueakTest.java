package estrategia;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SqueakTest {
    private Squeak sq;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        sq = new Squeak();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void makeSound() {
        sq.makeSound();
        assertTrue(out.toString().toLowerCase().contains("i am squeak"));
    }
    @Test
    public void testToString() {
        String esperado = "squeak{}";
        String obtenido = sq.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}