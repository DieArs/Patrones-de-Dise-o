package observador;

import junit.framework.TestCase;
import org.junit.Test;

public class CurrentConditionsDisplayTest extends TestCase {
    private WeatherData weatherData;
    private CurrentConditionsDisplay currentDisplay;


    public void setUp() throws Exception {
        weatherData = new WeatherData();
        currentDisplay = new CurrentConditionsDisplay(weatherData);
    }

    public void testUpdate() {
        currentDisplay.update(80, 65, 30.4f);
        String expectedCurrentDisplay = "Current conditions: 80.0F degrees and 65.0% humidity";
        assertEquals(expectedCurrentDisplay, currentDisplay.getDisplayData());
    }

}