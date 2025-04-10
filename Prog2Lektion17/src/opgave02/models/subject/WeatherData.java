package opgave02.models.subject;

import opgave02.models.observer.CurrentConditionsDisplay;
import opgave02.models.observer.ForeCastDisplay;
import opgave02.models.observer.Observer;
import opgave02.models.observer.StatisticsDisplay;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WeatherData implements Subject {
    private Random random = new Random();
    private float temp = 0;
    private float humidity = 0;
    private float pressure = 0;
    private final Set<Observer> observers = new HashSet<>();

    public WeatherData() {}

    public void measurementsChanged() {
        temp = getTemperature();
        humidity = getHumidity();
        pressure = getPressure();
        updateObservers();
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

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }
}