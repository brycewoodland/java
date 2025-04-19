public class Celsius implements TemperatureInterface {
    private final double value;

    public Celsius(double value) {
        this.value = value;
    }

    @Override
    public double toFahrenheit() {
        return (value * 9 / 5) + 32;
    }

    @Override
    public double toCelsius() {
        return value;
    }

    @Override
    public double toKelvin() {
        return value + 273.15;
    }
}