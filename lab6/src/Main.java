import Flota.*;

public class Main {
    public static void main(String[] args) {


        Engine carEngine = new Engine(100, "Benzyna");
        FuelTank carFuelTank =  new FuelTank(100,100);
        Car car = new Car("Audi", "A4", 2019, 250, carEngine, carFuelTank, 5);

        Engine truckEngine = new Engine(200, "Benzyna");
        FuelTank truckFuelTank =  new FuelTank(200,200);
        Truck truck = new Truck("Ford", "F-150", 2019, 200, truckEngine, truckFuelTank, 1000);

        car.displayInfo();
        System.out.println("-------------------------------------");
        truck.displayInfo();
    }
}