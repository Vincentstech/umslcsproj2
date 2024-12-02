public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Smart Parking System!");

        // Create vehicles
        Vehicle car1 = new Vehicle("CAR123", "Car");
        Vehicle bike1 = new Vehicle("BIKE456", "Motorbike");
        Vehicle truck1 = new Vehicle("TRUCK789", "Truck");

        // Create parking spaces
        ParkingSpace space1 = new ParkingSpace(1, "Car");
        ParkingSpace space2 = new ParkingSpace(2, "Motorbike");
        ParkingSpace space3 = new ParkingSpace(3, "Truck");

        // Parking sensor setup
        ParkingSenor sensor = new ParkingSenor();

        // Parking strategy setup
        ParkingStrategy strategy = new ParkingStrategy();

        // Detect vehicles using the sensor
        System.out.println("Detecting vehicles");
        sensor.detectVehicle(car1);
        sensor.detectVehicle(bike1);
        sensor.detectVehicle(truck1);

        // Assign parking spaces using the strategy
        System.out.println("\nAssigning parking spaces");
        strategy.assignParkingSpace(car1, space1);
        strategy.assignParkingSpace(bike1, space2);
        strategy.assignParkingSpace(truck1, space3);

        // Display parking status
        System.out.println("\nParking status:");
        System.out.println(space1);
        System.out.println(space2);
        System.out.println(space3);

        // Simulate unparking
        System.out.println("\nUnparking vehicles");
        space1.unparkVehicle();
        space2.unparkVehicle();

        // Display updated parking status
        System.out.println("\nUpdated parking status:");
        System.out.println(space1);
        System.out.println(space2);
        System.out.println(space3);

        System.out.println("\nSmart Parking System Completed.");
    }
}
