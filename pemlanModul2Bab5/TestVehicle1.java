public class TestVehicle1 {
    public static void main(String[] args) {
        System.out.println("Creating a vehicle with max load 10,000 kg maximumload.");
        Vehicle1 vehicle = new Vehicle1(10000);
        System.out.println("Add box #1 (500 kg) : " + vehicle.addBox(500));
        System.out.println("Add box #2 (250 kg) : " + vehicle.addBox(250));
        // System.out.println("Add load(100kg) : " + (vehicle.load=500));
        System.out.println("Add box #3 (5000 kg) : " + vehicle.addBox(5000));
        System.out.println("Add box #4 (4000 kg) : " + vehicle.addBox(4000));
        System.out.println("Add box #5 (300 kg) : " + vehicle.addBox(300));
        System.out.println("Vehicle load is: " + vehicle.getLoad() + " kg");
        System.out.println("Add load(100kg) : " + (vehicle.load=500));
        System.out.println("Vehicle load is: " + vehicle.getLoad() + " kg");
    }
}
