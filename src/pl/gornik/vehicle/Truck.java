package pl.gornik.vehicle;

public class Truck {
    private String brand;
    private int capacity;

    public Truck(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public void increaseCapacity(int extraCapacity) {
        capacity += extraCapacity;
    }

    public boolean isAbleToTransport(int capacity) {
        return this.capacity >= capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
