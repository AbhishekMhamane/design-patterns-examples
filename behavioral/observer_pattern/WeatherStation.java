package behavioral.observer_pattern;

public class WeatherStation {

    public static void main(String[] args) {
        System.out.println("\n-- Observer Pattern ---");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);
    }
}
