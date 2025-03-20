package Zadanie2;

import Tasks.InputData;

public class SamochodOsobowy extends Samochod{
    private double waga;
    private double pojemnoscSilnika;
    private int iloscOsob;

    public SamochodOsobowy() {
        super();
        InputData input = new InputData();

        System.out.println("Podaj wage samochodu: ");
        double waga = input.InputDouble();
        if(waga >= 2 && waga <= 4.5)
            this.waga = waga;

        System.out.println("Podaj pojemnosc silnika samochodu: ");
        double pojemnoscSilnika = input.InputDouble();
        if(pojemnoscSilnika >= 0.8 && pojemnoscSilnika <= 3)
            this.pojemnoscSilnika = pojemnoscSilnika;

        System.out.println("Podaj ilosc osob samochodu: ");
        this.iloscOsob = input.InputInt();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Waga: "+waga);
        System.out.println("Pojemnosc silnika: "+pojemnoscSilnika);
        System.out.println("Ilosc osob: "+iloscOsob);
    }
}
