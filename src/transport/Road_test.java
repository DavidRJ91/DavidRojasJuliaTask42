package transport;

public class Road_test {
    public static void main(String[] args) {
        Road myRoad = new Road();
        myRoad.addVehicle(10000);
        myRoad.addVehicle(5000);
        myRoad.addVehicle(4000);
        myRoad.addVehicle(20000);
        myRoad.addVehicle(15000);
        myRoad.addVehicle(4000);

        Vehicle Camion = myRoad.getVehicle(3);
        Camion.addBox(1000);
        Camion.addBox(2000);
        Camion.addBox(2000);
        System.out.println(myRoad.getVehicle(3));

    }
}
