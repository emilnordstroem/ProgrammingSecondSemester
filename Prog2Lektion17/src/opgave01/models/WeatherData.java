package opgave01.models;

import java.util.Random;

public class WeatherData {
    Random random = new Random();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForeCastDisplay foreCastDisplay = new ForeCastDisplay();

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        foreCastDisplay.update(temp, humidity, pressure);
    }

    private float getTemperature() {
        return Math.round(random.nextFloat(-20, 40) * 100) / 100.0f;
    }

    private float getHumidity() {
        return Math.round(random.nextFloat(2, 98));
    }

    private float getPressure() {
        return random.nextInt(900, 1080);
    }
}
