package _2_observer;

import _2_observer.Interface.Observer;
import _2_observer.Interface.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private List observersList;

    public WeatherData() {
        observersList = new ArrayList();

    }
    //3
    public void measurementsChanged(){
        notifyObserver();
    }

    //2
    void setMeansurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /////////////////////////////////////////
    @Override
    public void registerObserver(Observer o) {
        observersList.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        int i = observersList.indexOf(o);
        if (i >= 0) {
            observersList.remove(i);
        }
    }
    //1
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observersList.size(); i++) {
            Observer observer = (Observer) observersList.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
}
