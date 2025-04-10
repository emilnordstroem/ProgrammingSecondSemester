package opgave01.models;

public class CurrentConditionsDisplay {

    public void update(float temp, float humidity, float pressure) {
        System.out.printf("Current Conditions%nTemperature: %.2f%nHumidity: %.2f%nPressure: %.2f%n============================%n",
                temp,
                humidity,
                pressure);
    }
}
