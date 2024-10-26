package estrategia;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RubberDuckTest {
    private RubberDuck rd;
    private ByteArrayOutputStream out;
    @Before
    public void setUp() throws Exception {
        rd = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testFly() {
        rd.performFly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }
    @Test
    public void testSwim() {
        rd.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }
    @Test
    public void testQuack() {
        rd.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i cannot making sound"));
    }
    @Test
    public void testDisplay() {
        rd.display();
        assertTrue(out.toString().toLowerCase().contains("i am a rubber duck"));
    }
    @Test
    public void testToString() {
        String esperado = "rubberduck{}";
        String obtenido = rd.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
