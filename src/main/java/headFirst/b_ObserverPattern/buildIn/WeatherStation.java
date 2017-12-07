package headFirst.b_ObserverPattern.buildIn;

import headFirst.b_ObserverPattern.buildIn.display.CurrentConditionsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);
        weatherData.setMeasurements(20,30,40);
        weatherData.setMeasurements(30,40,50);
    }
}
