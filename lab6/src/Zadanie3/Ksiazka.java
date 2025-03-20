package Zadanie3;

public class Ksiazka {
    protected String tytul;
    protected String autor;
    protected int rokWydania;
    protected double cena;

    public Ksiazka(String tytul, String autor, int rokWydania, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.cena = cena;
    }

    public void showInfo(){
        System.out.print("Książka: Tytuł: „"+tytul+"‟; Autor: "+autor+"; Rok Wydania: "+rokWydania+"r. ; Cena: "+cena+"zł");
    }

}
