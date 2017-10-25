import transport.Vehicle;
/**
 * Aqui realizamos las pruebas y realizamos la impresiones en pantalla.
 */
public class TestVehicle {
    static public void main(String args[]) {
        Vehicle myVehicle = new Vehicle(10000);
        System.out.println("La capacidad del vehiculo es "+ myVehicle.getMaxLoad() + " KG");

        System.out.println(myVehicle.addBox(500));

        System.out.println(myVehicle.addBox(250));

        System.out.println(myVehicle.addBox(5000));

        System.out.println(myVehicle.addBox(6000));

        System.out.println(myVehicle.addBox(4000));

        System.out.println(myVehicle.addBox(300));

        System.out.println("La carga total del camion es "+ myVehicle.getLoad() + "KG");

    }
}

/**
 * David Rojas Julia
 * 2º ASIX
 */