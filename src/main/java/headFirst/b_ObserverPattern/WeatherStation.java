package headFirst.b_ObserverPattern;

import headFirst.b_ObserverPattern.display.CurrentConditionsDisplay;
import headFirst.b_ObserverPattern.display.ForecastDisplay;
import headFirst.b_ObserverPattern.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);
        weatherData.setMeasurements(20,30,40);
        weatherData.setMeasurements(30,40,50);
    }
}
