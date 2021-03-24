package vehicles;

import vehicles.Engine;

public abstract class Vehicle {

    private Engine engine;
    private double price;
    private String colour;

    public Vehicle(Engine engine, double price, String colour) {
        this.engine = engine;
        this.price = price;
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
