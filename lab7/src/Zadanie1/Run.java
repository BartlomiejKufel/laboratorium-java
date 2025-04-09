package Zadanie1;

import Tasks.InputData;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Run {
    List<Pojazd> pojazdy = new ArrayList<>();
    InputData input = new InputData();

    public void start(){
        pojazdy.add(new Samochod("Mercedes", "SE01"));
        pojazdy.add(new SamochodElektryczny("Tesla Y", "SE02"));
        pojazdy.add(new RowerElektryczny("Nimbus 3000", "SE03"));

        menu();
    }



    private void menu(){
        int option=0;
        do{
            System.out.println("============Menu============");
            System.out.println("1. Wyświetl wszystkie pojazdy");
            System.out.println("2. Wyświetl pojazd o konkretnym ID");
            System.out.println("3. Dodaj pojazd");
            System.out.println("4. Zmień status pojazdu");
            System.out.println("5. Oblicz koszt wynajmu");
            System.out.println("6. Wyjdź");
            System.out.println("============================");
            System.out.print(">");

            option = input.InputInt();
        }while(option < 1 || option > 6);

        switch (option){
            case 1: showAll();break;
            case 2: showById();break;
            case 3: addVehicle();break;
            case 4: changeStatus();break;
            case 5: calculateCost();break;
            case 6: exit();break;

            default:
                System.out.println("Błąd wyboru");
        }
    }

    private void changeStatus() {
    }

    private void addVehicle() {
        
    }

    private void showAll() {
        
    }

    private void showById() {
        System.out.println("============Wyświetlanie pojazdu============");
        System.out.println("Podaj id pojazdu do wyświetlenia:");
        System.out.print(">");
        String id = input.InputString();
        for (Pojazd p : pojazdy){
            if(Objects.equals(p.getId(), id)){
                p.wyswietl();
            }
        }

    }

    private void calculateCost() {
        System.out.println("============Oblicz koszt============");
        System.out.println("Podaj id pojazdu do obliczenia kosztu:");
        System.out.print(">");
        String id = input.InputString();
        //Tutaj reszta kodu metoda od wyświetlania pojazdu i potem czy dobre czy nie a potem pobierasz ilość godzin i lets go dalej

    }


    private void exit() {
        System.out.println("Do widzenia!");
        System.exit(1);
    }

}
