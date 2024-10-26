package estrategia;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RedheadDuckTest {
    private RedheadDuck rhd;
    private ByteArrayOutputStream out;
    @Before
    public void setUp() throws Exception {
        rhd = new RedheadDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testSwim() {
        rhd.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }
    @Test
    public void testFly() {
        rhd.performFly();
        assertTrue(out.toString().toLowerCase().contains("i am flying"));
    }
    @Test
    public void testQuack() {
        rhd.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i am quack"));
    }
    @Test
    public void testDisplay() {
        rhd.display();
        assertTrue(out.toString().toLowerCase().contains("i am a redhead duck"));
    }
    @Test
    public void testToString() {
        String esperado = "redheadduck{}";
        String obtenido = rhd.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}