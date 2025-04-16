import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double value = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter current temperature unit (Celsius, Fahrenheit, Kelvin): ");
        String fromUnit = scan.nextLine();

        TemperatureInterface temp = TempFactory.create(fromUnit, value);

        System.out.print("Convert to which unit? (Celsius, Fahrenheit, Kelvin): ");
        String toUnit = scan.nextLine();

        double result = switch (toUnit.toLowerCase()) {
            case "celsius" -> temp.toCelsius();
            case "fahrenheit" -> temp.toFahrenheit();
            case "kelvin" -> temp.toKelvin();
            default -> {
                System.out.println("Invalid conversion unit.");
                yield Double.NaN;
            }
        };

        if (!Double.isNaN(result)) {
            System.out.printf("Converted value: %.2f %s%n", result, toUnit);
        }

        scan.close();
    }
}