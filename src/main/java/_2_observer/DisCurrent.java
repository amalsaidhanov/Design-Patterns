package _2_observer;

import _2_observer.Interface.Observer;
import _2_observer.Interface.Subject;

public class DisCurrent implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public DisCurrent(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("*********DISPLAYING CURRENT***********");
        System.out.println(temperature + " " + humidity + " " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
