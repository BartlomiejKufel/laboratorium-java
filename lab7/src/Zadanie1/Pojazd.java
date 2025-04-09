package Zadanie1;

public abstract class Pojazd {
    protected String model;
    protected String id;
    protected boolean czyDostepny = true;

    public Pojazd(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public void wypozycz(){
        czyDostepny = false;
        System.out.println("Wypozyczyłeś pojazd ");
    }

    public void wyswietl(){
        System.out.println("Model: "+ model);
        System.out.println("Id: "+id);
        if(czyDostepny)
            System.out.println("Czy dostępny: TAK");
        else
            System.out.println("Czy dostępny: NIE");

    }
    public void zwroc(){
        czyDostepny = true;
        System.out.println("Zwrociłeś pojazd");
    }

    public boolean isCzyDostepny(){
        return czyDostepny;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public abstract double obliczKoszt(int liczbaGodzin);
}
