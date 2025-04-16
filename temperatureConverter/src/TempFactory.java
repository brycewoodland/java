public class TempFactory {
    public static TemperatureInterface create(String type, double value) {
        return switch (type.toLowerCase()) {
            case "celsius" -> new Celsius(value);
            case "fahrenheit" -> new Fahrenheit(value);
            case "kelvin" -> new Kelvin(value);
            default -> throw new IllegalArgumentException("Unknown Temperature Type.");
        };
    }
}
