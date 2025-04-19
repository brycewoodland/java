import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CelsiusTest {

    @Test
    void toFahrenheit() {
        Celsius temp = new Celsius(100);
        assertEquals(212, temp.toFahrenheit(), 0.01); // 100°C is 212°F
    }

    @Test
    void toCelsius() {
        Celsius temp = new Celsius(25);
        assertEquals(25, temp.toCelsius(), 0.01); // 25°C should remain 25°C
    }

    @Test
    void toKelvin() {
        Celsius temp = new Celsius(25);
        assertEquals(298.15, temp.toKelvin(), 0.01); // 25°C is 298.15K
    }

    @Test
    void testNegativeCelsius() {
        Celsius temp = new Celsius(-40);
        assertEquals(-40, temp.toCelsius(), 0.01); // -40°C should remain -40°C
        assertEquals(233.15, temp.toKelvin(), 0.01); // -40°C is 233.15K
    }
}
