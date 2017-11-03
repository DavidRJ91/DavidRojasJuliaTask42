package transport;


public class Road {
    private Vehicle[] Nvehicles;
    private int numberOfVehicles;

    public Road() {
        Nvehicles = new Vehicle[5];
        numberOfVehicles = 0;
        System.out.println("Hay " + getNumberOfVehicles() + " camiones en la carretera.");

    }

    public boolean addVehicle (double MaxLoad){
        if (numberOfVehicles < Nvehicles.length){
            Nvehicles [numberOfVehicles] = new Vehicle(MaxLoad);
            numberOfVehicles++;
            System.out.println("El camion numero "+numberOfVehicles+" con "+MaxLoad+" KG de carga");
            return true;
        }
        else{System.out.println("ERROR: En esta carretera solo pueden ir 5 vehiculos.");
            return false;
        }
    }
    public int getNumberOfVehicles (){return numberOfVehicles;}

    public Vehicle getVehicle(int y){ 
        if(y < Nvehicles.length) {
            return Nvehicles[y];
        }
        else{return null;}
    }
}
