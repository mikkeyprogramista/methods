package pl.gornik.vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- CAR -----");
        Car car = new Car("Furmanka", 1902);
        System.out.println(car);

        car.setBrand("Opel");
        System.out.println(car);

        System.out.println("Age: " + car.getAge());

        System.out.println("");
        System.out.println("----- TRUCK -----");
        Truck truck = new Truck("Scania", 200);
        System.out.println(truck);

        truck.increaseCapacity(50);
        System.out.println(truck);

        System.out.println("Is able to transport: " + truck.isAbleToTransport(100));

        System.out.println("");
        System.out.println("----- MOTORBIKE -----");
        Motorbike motorbike = new Motorbike("NewShadow", 2008);
        System.out.println(motorbike);

        motorbike.increaseSpeed(16);
        System.out.println(motorbike);

        System.out.println("Is fast?: " + motorbike.isFast());
    }
}
