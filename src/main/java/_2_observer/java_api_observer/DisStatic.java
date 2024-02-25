package _2_observer.java_api_observer;


import java.util.Observable;
import java.util.Observer;

public class DisStatic implements Observer {

    private float temperature;
    private float pressure;

    Observable observable;

    public DisStatic(Observable observable) {
        this.observable = observable;
        observable.addObserver( this);
    }


    public void display() {
        System.out.println("*********DISPLAYING STATIC***********");
        System.out.println(temperature + " " + pressure);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();

            display();
        }
    }
}

