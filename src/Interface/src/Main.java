import BaseConverter.Selsey;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Selsey selsey = new Selsey();
        double celsius = 25.0;

        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + selsey.convertToKelvin(celsius));
        System.out.println("Fahrenheit: " + selsey.convertToFahrenheit(celsius));
    }
}