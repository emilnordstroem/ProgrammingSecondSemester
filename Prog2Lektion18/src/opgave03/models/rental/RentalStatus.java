package opgave03.models.rental;

import opgave03.models.vehicles.Vehicle;

public class RentalStatus extends Rental {
    private final boolean isRented;

    public RentalStatus(Vehicle vehicle, boolean isRented) {
        super(vehicle);
        this.isRented = isRented;
    }

    @Override
    public String getDescription() {
        return super.vehicle.getDescription() + "\nRental status: " + isRented;
    }

}
