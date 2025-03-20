package Zadanie1;

public class Kwadrat extends Prostokat{
    public Kwadrat(double a) {
        super(a, a);
    }

    public Kwadrat(double a, String kolor) {
        super(a, a, kolor);
    }

    public double getWys() {
        return wys;
    }

    public void setWys(double wys) {
        this.wys = wys;
        this.szer = wys;
    }

    public double getSzer() {
        return szer;
    }

    public void setSzer(double szer) {
        this.szer = szer;
        this.wys = szer;
    }


}
