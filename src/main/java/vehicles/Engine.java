package vehicles;

public enum Engine {

    Petrol(1200),
    Diesel(2000),
    Electric(0),
    Hybrid(2500);

    private final int size;

    Engine(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
