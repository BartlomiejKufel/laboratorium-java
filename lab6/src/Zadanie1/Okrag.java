package Zadanie1;

public class Okrag extends Figura{
    Punkt srodek;
    double promien;

    public Okrag() {
        srodek = new Punkt(0,0);
        promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return Math.PI * promien * promien;
    }

    public double getSrednica() {
        return promien *2;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public void wSrodku(Punkt punkt){

        double result = (punkt.x - srodek.x)*(punkt.x - srodek.x) + (punkt.y - srodek.y)*(punkt.y - srodek.y);

        if(result <= promien*promien){
            System.out.println("Okrag zawiera punkt");
        }
        else{
            System.out.println("Okrag nie zawiera punktu");
        }
    }

    public String opis(){
        return super.opis()+"Klasa Okrag. Srodek: ("+srodek.x+", "+srodek.y+") . Promien: "+promien;
    }

}
