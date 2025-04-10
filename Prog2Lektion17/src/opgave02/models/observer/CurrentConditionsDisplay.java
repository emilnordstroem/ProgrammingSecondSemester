package opgave02.models.observer;

public class CurrentConditionsDisplay implements Observer, Display {

    public CurrentConditionsDisplay() {}

    @Override
    public void update(float temp, float humidity, float pressure) {
        display(temp, humidity, pressure);
    }

    @Override
    public void display(float temp, float humidity, float pressure) {
        System.out.printf("====Current Conditions====%nTemperature: %.2f%nHumidity: %.2f%nPressure: %.2f%n",
                temp,
                humidity,
                pressure
        );
    }
}
