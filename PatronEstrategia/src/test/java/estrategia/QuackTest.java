package estrategia;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QuackTest {
    private Quack q;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        q = new Quack();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testMakeSound() {
        q.makeSound();
        assertTrue(out.toString().toLowerCase().contains("i am quack"));
    }
    @Test
    public void testToString() {
        String esperado = "quack{}";
        String obtenido = q.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}