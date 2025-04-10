package opgave03;

import opgave03.models.rental.RentalPrice;
import opgave03.models.rental.RentalStatus;
import opgave03.models.vehicles.Car;
import opgave03.models.vehicles.CarType;
import opgave03.models.vehicles.Motorcycle;
import opgave03.models.vehicles.Vehicle;

import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("Porsche", "Taycan", CarType.SEDAN);
        vehicle = new RentalPrice(vehicle, 450);
        vehicle = new RentalStatus(vehicle, false);
        System.out.println(vehicle.getDescription());


        System.out.println("===========================");
        List<Vehicle> vehicles = List.of(
                new Car("Ford", "Mustang", CarType.SEDAN),
                new Car("Nissan", "Leaf", CarType.HATCHBACK),
                new Car("Volkswagen", "Golf", CarType.CABRIOLET),
                new Motorcycle("Harley-Davidson", "Street Bob", 700),
                new Motorcycle("Kawasaki", "Ninja", 1000)
        );

        vehicles.forEach(System.out::println);
    }
}
