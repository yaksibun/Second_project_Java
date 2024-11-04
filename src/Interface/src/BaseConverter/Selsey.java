package BaseConverter;

public class Selsey implements BaseConverter {


    @Override
    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
