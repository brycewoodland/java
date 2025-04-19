import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TempFactoryTest {

    @Test
    void createCelsius() {
        TemperatureInterface temp = TempFactory.create("Celsius", 25);
        assertTrue(temp instanceof Celsius);
        assertEquals(25.0, temp.toCelsius(), 0.01);
    }

    @Test
    void createFahrenheit() {
        TemperatureInterface temp = TempFactory.create("Fahrenheit", 32);
        assertTrue(temp instanceof Fahrenheit);
        assertEquals(32.0, temp.toFahrenheit(), 0.01);
    }

    @Test
    void createKelvin() {
        TemperatureInterface temp = TempFactory.create("Kelvin", 300);
        assertTrue(temp instanceof Kelvin);
        assertEquals(300.0, temp.toKelvin(), 0.01);
    }

    @Test
    void createInvalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            TempFactory.create("Unknown", 100);
        });
    }
}
