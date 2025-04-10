package opgave01;

import opgave01.models.WeatherData;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        while (true) {
            weatherData.measurementsChanged();
            Thread.sleep(1000);
        }
    }
}
