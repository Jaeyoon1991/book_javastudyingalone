package sec02.exam03;

public class VehicleExmaple {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
    
}
