package observador;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class WeatherDataTest extends TestCase {
    private WeatherData weatherData;

    @Before
    public void setUp() throws Exception {
        weatherData = new WeatherData();
    }

    @Test
    public void testToString() {
        weatherData.setMeasurements(80,65,30.4f);
        String expected = "WeatherData{" +
                "observers=" + weatherData.getObservers().toString() +
                ", temperature=80.0" +
                ", humidity=65.0" +
                ", pressure=30.4" +
                '}';
        assertEquals(expected, weatherData.toString());
    }
}