public class Main {
    public static void main(String[] args) {
        // Create sensors
        ParkingSensor ultrasonicSensor = new UltrasonicSensor();
        ParkingSensor cameraSensor = new CameraSensor();

        // Test sensors
        System.out.println("Ultrasonic Sensor Status: " + ultrasonicSensor.getParkingStatus());
        System.out.println("Camera Sensor Status: " + cameraSensor.getParkingStatus());

        // Create parking
        ParkingStrategy basicStrategy = new BasicParkingStrategy();
        ParkingStrategy dynamicStrategy = new DynamicParkingStrategy();

        // Test strategies
        System.out.println(basicStrategy.findAvailableParking());
        basicStrategy.optimizeParking();

        System.out.println(dynamicStrategy.findAvailableParking());
        dynamicStrategy.optimizeParking();

        //parking lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpace(new ParkingSpace("A1", "Standard"));
        parkingLot.addParkingSpace(new ParkingSpace("B1", "Compact"));
        parkingLot.addParkingSpace(new ParkingSpace("C1", "Disabled-Accessible"));

        //available spaces
        parkingLot.displayAvailableSpaces();
    }
}
