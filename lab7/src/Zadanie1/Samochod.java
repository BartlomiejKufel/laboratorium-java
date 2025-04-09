package Zadanie1;

public class Samochod extends Pojazd{

    public Samochod(String model, String id) {
        super(model, id);
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin*46.5;
    }
}
