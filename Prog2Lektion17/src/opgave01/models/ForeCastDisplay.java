package opgave01.models;

public class ForeCastDisplay {
    private static float lastRecordedTemp = 0;
    private static float lastRecordedHumidity = 0;
    private static float lastRecordedPressure = 0;

    public void update(float temp, float humidity, float pressure) {
        float forecastTemp = forecast(temp, lastRecordedTemp);
        float forecastHumidity = forecast(humidity, lastRecordedHumidity);
        float forecastPressure = forecast(pressure, lastRecordedPressure);

        lastRecordedTemp = temp;
        lastRecordedHumidity = humidity;
        lastRecordedPressure = pressure;

        System.out.printf("Forecasted Conditions%nTemperature: %.2f%nHumidity: %.2f%nPressure: %.2f%n============================%n",
                forecastTemp,
                forecastHumidity,
                forecastPressure
        );

    }

    public float forecast(float currentRecord, float previousRecord){
        return currentRecord + (currentRecord - previousRecord);
    }

}
