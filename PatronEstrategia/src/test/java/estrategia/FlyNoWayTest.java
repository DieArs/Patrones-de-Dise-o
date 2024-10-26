package estrategia;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyNoWayTest {
    private FlyNoWay fnw;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        fnw = new FlyNoWay();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testFly() {
        fnw.fly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }
    @Test
    public void testToString() {
        String esperado = "flynoway{}";
        String obtenido = fnw.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}