package headFirst.b_ObserverPattern.custom.display;

import headFirst.b_ObserverPattern.custom.Observer;
import headFirst.b_ObserverPattern.custom.Subject;

public class ForecastDisplay implements Observer, headFirst.b_ObserverPattern.custom.display.DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("displaying forecast.");
    }
}
