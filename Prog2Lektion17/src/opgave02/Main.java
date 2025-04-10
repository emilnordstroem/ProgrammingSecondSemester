package opgave02;

import opgave02.models.observer.CurrentConditionsDisplay;
import opgave02.models.observer.ForeCastDisplay;
import opgave02.models.observer.StatisticsDisplay;
import opgave02.models.subject.WeatherData;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new StatisticsDisplay());
        weatherData.registerObserver(new ForeCastDisplay());

        while (true) {
            weatherData.measurementsChanged();
            Thread.sleep(1000);
        }
    }
}
