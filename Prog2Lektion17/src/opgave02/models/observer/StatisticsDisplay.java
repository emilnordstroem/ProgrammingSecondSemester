package opgave02.models.observer;

public class StatisticsDisplay implements Observer, Display {
    private static float totalTemp = 0;
    private static float totalHumidity = 0;
    private static float totalPresure = 0;
    private static int daysCounter = 2;

    public StatisticsDisplay() {}

    @Override
    public void update(float temp, float humidity, float pressure) {
        totalTemp += temp;
        totalHumidity += humidity;
        totalPresure += pressure;

        float avgTemp = calculateAverage(temp, daysCounter);
        float avgHumidity = calculateAverage(humidity, daysCounter);
        float avgPressure = calculateAverage(pressure, daysCounter);

        display(avgTemp, avgHumidity, avgPressure);

    }

    private float calculateAverage(float total, int days){
        return total / days;
    }

    @Override
    public void display(float temp, float humidity, float pressure) {
        System.out.printf("====Average Conditions====%nTemperature: %.2f%nHumidity: %.2f%nPressure: %.2f%n",
                temp,
                humidity,
                pressure
        );
    }
}