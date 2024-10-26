package Decorador;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class DecafTest {
    private Beverage b;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        b = new Decaf();
        out = new ByteArrayOutputStream();
        System.setOut( new java.io.PrintStream( out ));
    }
    @Test
    public void cost() {
        double esperado = 1.05;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01);
    }

    @Test
    public void testGetDescription() {
        String esperado = "decaf coffee";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }
    @Test
    public void testWithMilkAndMochaCost() {
        b = new Milk(b);
        b = new Mocha(b);
        double esperado = 1.35;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }
    @Test
    public void testWithMilkAndMochaDescription() {
        b = new Milk(b);
        b = new Mocha(b);
        String esperado = "decaf coffee,with steamed milk,with mocha";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }
    @Test
    public void testWithMilkAndSoyCost() {
        b = new Milk(b);
        b = new Soy(b);
        double esperado = 1.30;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }
    @Test
    public void testWithMilkAndSoyDescription() {
        b = new Milk(b);
        b = new Soy(b);
        String esperado = "decaf coffee,with steamed milk,with soy";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }
    @Test
    public void testWithMilkAndWhipCost() {
        b = new Milk(b);
        b = new Whip(b);
        double esperado = 1.25;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }
    @Test
    public void testWithMilkAndWhipDescription() {
        b = new Milk(b);
        b = new Whip(b);
        String esperado = "decaf coffee,with steamed milk,with whip";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }
    @Test
    public void testToString() {
        String esperado = "decaf{description='decaf coffee'}";
        String obtenido = b.toString().toLowerCase();
        assertEquals( esperado, obtenido );

    }
}