package estacao;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondidionsDisplay currentCondidionsDisplay = new CurrentCondidionsDisplay(weatherData);
        ForecastDisplay f = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setmeasurements(80, 65, 30.4f);
        weatherData.setmeasurements(82, 70, 29.2f);
        weatherData.setmeasurements(78, 90, 29.2f);
    }
}
