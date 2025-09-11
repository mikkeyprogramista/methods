package pl.gornik.vehicle;

import java.time.LocalDate;
import java.util.Date;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public int getAge() {
        return LocalDate.now().getYear() - year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
