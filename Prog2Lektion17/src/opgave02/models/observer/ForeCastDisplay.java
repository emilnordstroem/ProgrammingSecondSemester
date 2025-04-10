package opgave02.models.observer;

public class ForeCastDisplay implements Observer, Display {
    private static float lastRecordedTemp = 0;
    private static float lastRecordedHumidity = 0;
    private static float lastRecordedPressure = 0;

    @Override
    public void update(float temp, float humidity, float pressure) {
        float forecastTemp = forecast(temp, lastRecordedTemp);
        float forecastHumidity = forecast(humidity, lastRecordedHumidity);
        float forecastPressure = forecast(pressure, lastRecordedPressure);

        lastRecordedTemp = temp;
        lastRecordedHumidity = humidity;
        lastRecordedPressure = pressure;

        display(forecastTemp, forecastHumidity, forecastPressure);

    }

    public float forecast(float currentRecord, float previousRecord){
        return currentRecord + (currentRecord - previousRecord);
    }

    @Override
    public void display(float temp, float humidity, float pressure) {
        System.out.printf("====Forecasted Conditions====%nTemperature: %.2f%nHumidity: %.2f%nPressure: %.2f%n",
                temp,
                humidity,
                pressure
        );
    }
}
