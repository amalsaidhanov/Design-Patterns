package _2_observer.Interface_observer;

import _2_observer.Interface_observer.Interface.Observer;
import _2_observer.Interface_observer.Interface.Subject;



public class DisStatic implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public DisStatic(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("---------DISPLAYING STATIC---------");
        System.out.println(temperature + " " + humidity + " ");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}

