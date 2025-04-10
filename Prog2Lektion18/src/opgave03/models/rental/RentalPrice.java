package opgave03.models.rental;

import opgave03.models.vehicles.Vehicle;

public class RentalPrice extends Rental {
    private final double cost;

    public RentalPrice(Vehicle vehicle, double cost) {
        super(vehicle);
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return super.vehicle.getDescription() + "\n Rental price per day: " + cost + " DKK";
    }

}
