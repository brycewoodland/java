package main.java;

public class Fahrenheit implements TemperatureInterface {
    private final double value;

    public Fahrenheit(double value) {
        this.value = value;
    }

    @Override
    public double toFahrenheit() {
        return value;
    }

    @Override
    public double toCelsius() {
        return (value - 32) * 5 / 9;
    }

    @Override
    public double toKelvin() {
        return toCelsius() + 273.15;
    }
}