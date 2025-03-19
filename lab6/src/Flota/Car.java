package Flota;

public class Car extends Vehicle {
    private int passengerCapacity;

    //konstruktory nie dziedziczymy tylko pożyczamy
    public Car(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fuelTank, int passengerCapacity) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pojemność pasażerska: "+passengerCapacity);
    }
}
