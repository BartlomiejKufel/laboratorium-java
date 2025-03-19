package Flota;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected int maxSpeed;
    protected Engine engine;
    protected FuelTank fuelTank;

    public Vehicle(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fuelTank) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void displayInfo(){
        System.out.println("Marka: "+brand+"\nModel: "+model+"\nRok produkcji: "+year+"\nMaksymalna prędkość: "+maxSpeed);
        engine.displayInfo();
        engine.startEngine();
        fuelTank.displayInfo();

    }



}
