package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;


    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void addVehicleToStock(Vehicle vehicle){
        this.stock.add(vehicle);
    }
}
