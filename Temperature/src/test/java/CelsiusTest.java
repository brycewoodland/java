import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CelsiusTest {

    @Test
    public void testToFahrenheit() {
        Celsius c = new Celsius(0);
        assertEquals(32.0, c.toFahrenheit(), 0.01);
    }

    @Test
    public void testToKelvin() {
        Celsius c = new Celsius(100);
        assertEquals(373.15, c.toKelvin(), 0.01);
    }
}
