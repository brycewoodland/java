public class Kelvin implements TemperatureInterface {
    private final double value;

    public Kelvin(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero (0 Kelvin).");
        }
        this.value = value;
    }

    @Override
    public double toFahrenheit() {
        return ((value - 273.15) * 9/5) + 32;
    }

    @Override
    public double toCelsius() {
        return value - 273.15;
    }

    @Override
    public double toKelvin() {
        return value;
    }
}
