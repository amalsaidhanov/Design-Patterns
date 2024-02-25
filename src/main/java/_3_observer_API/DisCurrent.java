package _3_observer_API;

import java.util.Observable;
import java.util.Observer;

public class DisCurrent implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    Observable observable;

    public DisCurrent(Observable observable) {
        this.observable = observable;
        observable.addObserver( this);
    }


    public void display() {
        System.out.println("*********DISPLAYING CURRENT***********");
        System.out.println(temperature + " " + humidity + " " + pressure);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }
}
