package Tasks;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;


    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, int wiek) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public void View(){
        System.out.println("Imie i nazwisko: "+imie+" "+nazwisko+"\nWiek: "+wiek);
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie != null)
            this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko != null)
            this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek > 0)
            this.wiek = wiek;
    }
}
