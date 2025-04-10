package opgave03.models.vehicles;

public class Motorcycle extends Vehicle {
    private final String make;
    private final String model;
    private final int cc;

    public Motorcycle(String make, String model, int cc) {
        this.make = make;
        this.model = model;;
        this.cc = cc;
    }

    @Override
    public String getDescription(){
        return make + " " + model + " cc: " + cc;
    }

    @Override
    public String toString() {
        return make + " " + model + " cc: " + cc;
    }
}
