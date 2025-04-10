package opgave03.models.vehicles;

public class Car extends Vehicle {
    private final String make;
    private final String model;
    private final CarType type;

    public Car(String make, String model, CarType type) {
        this.make = make;
        this.model = model;
        this.type = type;
    }

    @Override
    public String getDescription(){
        return make + " " + model + " type: " + type;
    }

    @Override
    public String toString() {
        return make + " " + model + " type: " + type;
    }
}
