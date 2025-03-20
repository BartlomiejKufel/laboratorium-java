package Zadanie3;

public class Podrecznik extends Ksiazka{
    private String przedmiot;


    public Podrecznik(String tytul, String autor, int rokWydania, double cena, String przedmiot) {
        super(tytul, autor, rokWydania, cena);
        this.przedmiot = przedmiot;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(" ; Przedmiot: "+przedmiot);
    }
}
