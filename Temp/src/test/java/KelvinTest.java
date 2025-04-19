import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KelvinTest {

    @Test
    void testToKelvin() {
        Kelvin temp = new Kelvin(273.15);
        assertEquals(273.15, temp.toKelvin(), 0.01); // 273.15K should remain 273.15K
    }

    @Test
    void testToCelsius() {
        Kelvin temp = new Kelvin(273.15);
        assertEquals(0, temp.toCelsius(), 0.01); // 273.15K is 0°C
    }

    @Test
    void testToFahrenheit() {
        Kelvin temp = new Kelvin(273.15);
        assertEquals(32, temp.toFahrenheit(), 0.01); // 273.15K is 32°F
    }

    @Test
    void testFahrenheitConversion() {
        Kelvin temp = new Kelvin(300);
        assertEquals(80.33, temp.toFahrenheit(), 0.01); // 300K is 80.33°F
    }

    @Test
    void testNegativeKelvin() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Kelvin(-1); // Kelvin cannot be negative
        });
    }
}
