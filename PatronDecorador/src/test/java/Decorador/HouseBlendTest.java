package Decorador;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;
public class HouseBlendTest {
    private Beverage b;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        b = new HouseBlend();
        out = new ByteArrayOutputStream();
        System.setOut( new java.io.PrintStream( out ));
    }
    @Test
    public void cost() {
        double esperado = 0.89;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01);
    }
    @Test
    public void testGetDescription() {
        String esperado = "house blend coffee";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }
    @Test
    public void testWithMilkAndMochaCost() {
        b = new Milk(b);
        b = new Mocha(b);
        double esperado = 1.19;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }
    @Test
    public void testWithMilkAndMochaDescription() {
        b = new Milk(b);
        b = new Mocha(b);
        String esperado = "house blend coffee,with steamed milk,with mocha";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }
    @Test
    public void testWithMilkAndSoyCost() {
        b = new Milk(b);
        b = new Soy(b);
        double esperado = 1.14;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }
    @Test
    public void testWithMilkAndSoyDescription() {
        b = new Milk(b);
        b = new Soy(b);
        String esperado = "house blend coffee,with steamed milk,with soy";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }
    @Test
    public void testWithMilkAndWhipCost() {
        b = new Milk(b);
        b = new Whip(b);
        double esperado = 1.09;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }
    @Test
    public void testWithMilkAndWhipDescription() {
        b = new Milk(b);
        b = new Whip(b);
        String esperado = "house blend coffee,with steamed milk,with whip";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testToString() {
        String esperado = "houseblend{description='house blend coffee'}";
        String obtenido = b.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }
}