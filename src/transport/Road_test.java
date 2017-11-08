package transport;

public class Road_test {
    
    
    /* Creamos la carretera y añadimos vehiculos con las cargas maximas que aceptan */
    public static void main(String[] args) {
        Road myRoad = new Road();
        myRoad.addVehicle(10000);
        myRoad.addVehicle(5000);
        myRoad.addVehicle(4000);
        myRoad.addVehicle(20000);
        myRoad.addVehicle(15000);
        myRoad.addVehicle(4000);
        
        /*Eligo el camion al cual quiero añadir carga */
        
        Vehicle camion = myRoad.getVehicle(2);
        
        /* Añadimos la carga al camion */
        
        boolean carga;

        carga= camion.addBox(1000);
        System.out.println(carga);

        carga = camion.addBox(2000);
        System.out.println(carga);

        carga = camion.addBox(2000);
        System.out.println(carga);
        
        /* Imprimo que ya se ha cargado el camion y la carga que ha conseguido cargar */

        System.out.println("Ya hemos cargado el camion numero 2");

        System.out.println("La carga total del camion es "+ camion.getLoad() + " KG");
    }
}

/* David Rojas Julia */
/* 2º Asix */
