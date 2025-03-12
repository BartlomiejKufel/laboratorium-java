package Tasks;

import InputData.InputData;

public class Student {
    private Osoba osoba;
    private int nrAlbumu;
    private String kierunek;
    private String specjalnosc;
    private int rokStudiow;

    //pełne dane
    public Student(Osoba osoba, int nrAlbumu, String kierunek, String specjalnosc, int rokStudiow) {
        this.osoba = osoba;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }

    //dane bez Osoba
    public Student(int nrAlbumu, String kierunek, String specjalnosc, int rokStudiow) {
        this.osoba = new Osoba("Nieznane", "Nieznane", 0);
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }

    //dane bez specjalności i roku
    public Student(Osoba osoba, int nrAlbumu, String kierunek) {
        this.osoba = osoba;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = "Nieznane";
        this.rokStudiow = 1;
    }

    //dane bez albumu i roku
    public Student(Osoba osoba, String kierunek, String specjalnosc) {
        this.osoba = osoba;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.nrAlbumu = 0;
        this.rokStudiow = 1;
    }


    public void View(){
        if(osoba != null)
            osoba.View();
        else
            System.out.println("Brak danych osobowych");

        System.out.println("Nr albumu: "+nrAlbumu+"\nKierunek: "+kierunek+"\nSpecjalność: "+specjalnosc+"\nRok: "+rokStudiow);
    }

    public void ChangeData(){
        InputData input = new InputData();

        System.out.println("Podaj nowe Imię: ");
        osoba.setImie(input.InputString());
        System.out.println("Podaj nowe Nazwisko: ");
        osoba.setNazwisko(input.InputString());
        System.out.println("Podaj nowy Wiek: ");
        osoba.setWiek(input.InputInt());
        System.out.println("Podaj nowy rok studiów: ");
        setRokStudiow(input.InputInt());
        System.out.println("Podaj nowy nr Albumu: ");
        setNrAlbumu(input.InputInt());
        System.out.println("Podaj nowy Kierunek: ");
        setKierunek(input.InputString());
        System.out.println("Podaj nową Specjalność: ");
        setSpecjalnosc(input.InputString());
    }


    public int getNrAlbumu() {
        return nrAlbumu;
    }

    public void setNrAlbumu(int nrAlbumu) {
        if(nrAlbumu > 0)
            this.nrAlbumu = nrAlbumu;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        if(kierunek != null)
            this.kierunek = kierunek;
    }

    public String getSpecjalnosc() {
        return specjalnosc;
    }

    public void setSpecjalnosc(String specjalnosc) {
        if(specjalnosc != null)
            this.specjalnosc = specjalnosc;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        if(rokStudiow >0)
            this.rokStudiow = rokStudiow;
    }
}
