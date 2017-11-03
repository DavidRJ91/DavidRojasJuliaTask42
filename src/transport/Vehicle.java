package transport;

public class Vehicle {

    private double load;
    private double maxLoad;

    public Vehicle(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getLoad() {
        return load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }


    public boolean addBox(double weight) {

        if (this.load + weight < maxLoad) {
            this.load = weight + this.load;
            System.out.println("Cargamos al caminon " +weight + " KG");
            return true;
        } else {
            System.out.println("Carga no introducida " +weight + " KG");
            return false;
        }
    }
}
