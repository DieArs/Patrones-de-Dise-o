package estrategia;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyLikeRocketTest {
    private FlyLikeRocket flr;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {

        flr = new FlyLikeRocket();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testFly() {
        flr.fly();
        assertTrue(out.toString().toLowerCase().contains("fly to infinity"));
    }
    @Test
    public void testToString() {
        String esperado = "flylikerocket{}";
        String obtenido = flr.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}