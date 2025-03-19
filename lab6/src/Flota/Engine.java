package Flota;

public class Engine {
    private int power;
    private String fuelType;

    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    public void startEngine(){
        System.out.println("Silnik uruchomiony");
    }

    public void displayInfo(){
        System.out.println("Moc silnika: "+power+" kM");
        System.out.println("Rodzaj paliwa: "+fuelType);
    }
}
