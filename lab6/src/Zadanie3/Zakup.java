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

    public Zakup(){
        this.klient = new Klient();
        this.ksiazka = new Ksiazka(); //to pewnie do zmiany, bo nie wiem, czy podręcznik będzie można dodać albo powieść
        this.dataZakupu = "";
    }

    public void showInfo(){
        klient.showInfo();
        ksiazka.showInfo();
        System.out.println("\nData zakupu: "+dataZakupu+" ;");

    }

}
