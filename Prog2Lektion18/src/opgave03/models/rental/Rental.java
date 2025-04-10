package opgave03.models.rental;

import opgave03.models.vehicles.Vehicle;

public abstract class Rental extends Vehicle {
    protected final Vehicle vehicle;

    protected Rental(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
