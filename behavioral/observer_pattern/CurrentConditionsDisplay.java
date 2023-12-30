package behavioral.observer_pattern;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObeserver(this);
    }

    @Override
    public void update() {
       this.temperature = weatherData.getTemperature();
       this.humidity = weatherData.getHumidity();
       display();
    }

    @Override
    public void display() {
     System.out.println("CurrentConditionsDisplay updated " + this.temperature + " " + this.humidity);
    }
    
}
