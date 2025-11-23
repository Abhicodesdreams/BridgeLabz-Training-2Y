interface Rentable {
    void rent();
    void returnVehicle();
}

class Car implements Rentable {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}

class Bike implements Rentable {
    public void rent() { System.out.println("Bike rented"); }
    public void returnVehicle() { System.out.println("Bike returned"); }
}

class Bus implements Rentable {
    public void rent() { System.out.println("Bus rented"); }
    public void returnVehicle() { System.out.println("Bus returned"); }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Rentable c = new Car();
        Rentable b = new Bike();
        Rentable bs = new Bus();

        c.rent();
        b.rent();
        bs.rent();
    }
}
