package estacao2;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        super.setChanged();
        this.notifyObservers();
    }

    public void setmeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @return the humidity
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * @return the pressure
     */
    public float getPressure() {
        return pressure;
    }

}
