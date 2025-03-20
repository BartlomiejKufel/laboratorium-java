package Zadanie3;

public class Powiesc extends Ksiazka{
    private String gatunek;

    public Powiesc(String tytul, String autor, int rokWydania, double cena, String gatunek) {
        super(tytul, autor, rokWydania, cena);
        this.gatunek = gatunek;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(" ; Gatunek: "+gatunek+";");
    }
}
