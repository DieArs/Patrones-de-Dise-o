package estrategia;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MallardDuckTest {
    private MallardDuck md;
    private ByteArrayOutputStream out;
    @Before
    public void setUp() throws Exception {
        md = new MallardDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testFly() {
        md.performFly();
        assertTrue(out.toString().toLowerCase().contains("i am flying"));
    }
    @Test
    public void testSwim() {
        md.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }
    @Test
    public void testQuack() {
        md.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i am quack"));
    }
    @Test
    public void testDisplay() {
        md.display();
        assertTrue(out.toString().toLowerCase().contains("i am a mallard duck"));
    }
    @Test
    public void testToString() {
        String esperado = "mallardduck{}";
        String obtenido = md.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
