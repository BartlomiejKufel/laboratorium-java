package Zadanie2;

import Tasks.InputData;

import java.util.Scanner;

public class Samochod {
    protected String marka;
    protected String model;
    protected String nadwozie;
    protected String kolor;
    protected int rokProdukcji;
    protected int przebieg;


    public Samochod() {
        InputData input = new InputData();
        System.out.println("Podaj markę samochodu: ");
        this.marka = input.InputString();
        System.out.println("Podaj model samochodu: ");
        this.model = input.InputString();
        System.out.println("Podaj nadwozie samochodu: ");
        this.nadwozie = input.InputString();
        System.out.println("Podaj kolor samochodu: ");
        this.kolor = input.InputString();
        System.out.println("Podaj rok produkcji samochodu: ");
        this.rokProdukcji = input.InputInt();
        System.out.println("Podaj przebieg samochodu: ");
        this.przebieg = input.InputInt();
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void displayInfo(){
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Nadwozie: "+nadwozie);
        System.out.println("Kolor: "+kolor);
        System.out.println("Rok produkcji: "+rokProdukcji);
        System.out.println("Przebieg: "+przebieg);
    }
}
