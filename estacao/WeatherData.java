package estacao;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }

    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }

    }

    public void setmeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this. humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
