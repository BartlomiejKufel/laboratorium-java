import Flota.*;
import Zadanie1.*;
import Zadanie2.Samochod;
import Zadanie2.SamochodOsobowy;
import Zadanie3.*;

public class Main {
    public static void main(String[] args) {


/*
        Engine carEngine = new Engine(100, "Benzyna");
        FuelTank carFuelTank =  new FuelTank(100,100);
        Car car = new Car("Audi", "A4", 2019, 250, carEngine, carFuelTank, 5);

        Engine truckEngine = new Engine(200, "Benzyna");
        FuelTank truckFuelTank =  new FuelTank(200,200);
        Truck truck = new Truck("Ford", "F-150", 2019, 200, truckEngine, truckFuelTank, 1000);

        car.displayInfo();
        System.out.println("-------------------------------------");
        truck.displayInfo();
*/
    /*
        //zadanie 1
        Punkt punkt1 = new Punkt(1,1);
        punkt1.opis();
        punkt1.przesuniecie(-1, 8);
        punkt1.opis();
        punkt1.zeruj();
        punkt1.opis();
        Figura figura1 = new Figura();
        System.out.println(figura1.opis());

        Prostokat prostokat1 = new Prostokat(10,7);
        System.out.println(prostokat1.getPowierzchnia());
        prostokat1.przesun(3,5);

        Trojkat trojkat1 = new Trojkat(10,4);

        Kwadrat kwadrat1 = new Kwadrat(12);

        System.out.println(prostokat1.opis());
        System.out.println(trojkat1.opis());
        System.out.println(kwadrat1.opis());

        Okrag okrag1 = new Okrag(punkt1, 5);
        System.out.println(okrag1.opis());
        System.out.println(okrag1.getPowierzchnia());
        okrag1.wSrodku(new Punkt(3,2));
*/

        /*
        //Zadanie 2
        SamochodOsobowy samochodOsobowy1 = new SamochodOsobowy();
        samochodOsobowy1.displayInfo();
        System.out.println("=================================");

        Samochod samochod1 = new Samochod();
        samochod1.displayInfo();

        System.out.println("=================================");
        Samochod samochod2 = new Samochod("Audi", "a4", "Sedan", "Niebieski", 2004, 100000);
        samochod2.displayInfo();
*/

        //Zadanie 3

        Klient klient1 = new Klient("Bartłomiej", "Kufel", 20, "606 913 565", "bartlomiej.kufel@gmail.com");
        Ksiazka ksiazka1 = new Podrecznik("Podręcznik do matmy", "Kacper Marysiak", 2002, 40.3, "Matematyka");

        Zakup zakup1 = new Zakup(klient1, ksiazka1, "20.05.2020r.");
        zakup1.showInfo();

        //klient1.editKlient();
    }
}