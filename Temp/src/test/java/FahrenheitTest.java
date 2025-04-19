import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FahrenheitTest {

    @Test
    void testToFahrenheit() {
        Fahrenheit temp = new Fahrenheit(32);
        assertEquals(32, temp.toFahrenheit(), 0.01); // 32°F should remain 32°F
    }

    @Test
    void testToCelsius() {
        Fahrenheit temp = new Fahrenheit(32);
        assertEquals(0, temp.toCelsius(), 0.01); // 32°F is 0°C
    }

    @Test
    void testToKelvin() {
        Fahrenheit temp = new Fahrenheit(32);
        assertEquals(273.15, temp.toKelvin(), 0.01); // 32°F is 273.15K
    }

    @Test
    void testNegativeFahrenheit() {
        Fahrenheit temp = new Fahrenheit(-40);
        assertEquals(-40, temp.toFahrenheit(), 0.01); // -40°F should be -40°F
    }

    @Test
    void testToCelsiusForNegative() {
        Fahrenheit temp = new Fahrenheit(-40);
        assertEquals(-40, temp.toCelsius(), 0.01); // -40°F is -40°C
    }

    @Test
    void testToKelvinForNegative() {
        Fahrenheit temp = new Fahrenheit(-40);
        assertEquals(233.15, temp.toKelvin(), 0.01); // -40°F is 233.15K
    }
}
