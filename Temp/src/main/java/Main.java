/*
 * This program demonstrates the Factory Method design pattern.
 *
 * The Factory Method is a creational design pattern that provides an interface
 * for creating objects, but allows subclasses to alter the type of objects
 * that will be created. Instead of calling a constructor directly to create an
 * object, a factory method is used to instantiate the object. This pattern is
 * particularly useful when the exact type of the object is not known until
 * runtime.
 *
 * In this program, the `TempFactory` class acts as the Factory that creates
 * objects of different temperature types. The `TemperatureInterface` is the
 * common interface implemented by various temperature classes
 * (`Celsius`, `Fahrenheit`, and `Kelvin`). The user enters a temperature value
 * and the current unit, and the `TempFactory` class is used to create an object
 * of the specified temperature unit. The program then uses this object to
 * convert the temperature to the desired unit by calling the corresponding
 * method (e.g., `toCelsius()`, `toFahrenheit()`, `toKelvin()`).
 *
 * This approach allows the code to remain flexible and easily extensible. If
 * new temperature units are added in the future, a new class implementing
 * `TemperatureInterface` can be added without modifying the core logic of the
 * program. Instead, the `TempFactory` can be updated to handle the new class,
 * following the Factory Method pattern to create objects of that type.
 */


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