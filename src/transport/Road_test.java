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

        Vehicle camion = myRoad.getVehicle(2);

        boolean carga;

        carga= camion.addBox(1000);
        System.out.println(carga);

        carga = camion.addBox(2000);
        System.out.println(carga);

        carga = camion.addBox(2000);
        System.out.println(carga);

        System.out.println("Ya hemos cargado el camion numero 2");

        System.out.println("La carga total del camion es "+ camion.getLoad() + " KG");
    }
}
