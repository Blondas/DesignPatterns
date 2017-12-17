package headFirst.b_ObserverPattern.buildIn.display;

import headFirst.b_ObserverPattern.buildIn.WeatherData;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    Observable weatherData;
    private float lastPressure;
    private float currentPressure = 29.92f;

    public ForecastDisplay(Observable observable) {
        this.weatherData = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
    }

    @Override
    public void update(Observable observable, Object arg) {
        if  (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }

    }
}
