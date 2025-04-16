public class Kelvin implements TemperatureInterface {
    private final double value;

    public Kelvin(double value) {
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
