package Zadanie3;

public class Zakup {
    private Klient klient;
    private Ksiazka ksiazka;
    private String dataZakupu;


    public Zakup(Klient klient, Ksiazka ksiazka, String dataZakupu) {
        this.klient = klient;
        this.ksiazka = ksiazka;
        this.dataZakupu = dataZakupu;
    }

    public void showInfo(){
        klient.showInfo();
        ksiazka.showInfo();
        System.out.println("\nData zakupu: "+dataZakupu+" ;");

    }

}
