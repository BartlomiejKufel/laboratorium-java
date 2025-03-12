package Lesson;

public class Samochod {
    private String marka;
    private String model;
    private int rok;
    private double przebieg;
    private double predkosc;

    public Samochod(){

    }

    public Samochod(String marka, String model, int rok, double przebieg, double predkosc) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        this.predkosc = predkosc;
    }

    //Konstruktor Kopiujący
    public Samochod(Samochod innySamochod) {
        this.marka = innySamochod.marka;
        this.model = innySamochod.model;
        this.rok = innySamochod.rok;
        this.przebieg = innySamochod.przebieg;
        this.predkosc = innySamochod.predkosc;
    }

    public void View(){
        System.out.println("Samochód:\nMarka: "+ marka+"\nModel: "+model+"\nRok produkcji: "+rok+"\nPrzebieg: "+przebieg);
    }

    public double Przyspiesz(double value){
        return predkosc + value;
    }


    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }

    public void setPredkosc(double predkosc) {
        this.predkosc = predkosc;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRok() {
        return rok;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public double getPredkosc() {
        return predkosc;
    }
}
