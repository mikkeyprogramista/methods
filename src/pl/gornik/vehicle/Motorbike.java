package pl.gornik.vehicle;

public class Motorbike {
    private String brand;
    private int speed;
    private static final String WEZMY_TEGO_MOTORBAJKA = "OKEJ";

    public Motorbike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void increaseSpeed(int extraSpeed) {
        speed += extraSpeed;
    }

    public boolean isFast() {
        return speed >= 100;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
