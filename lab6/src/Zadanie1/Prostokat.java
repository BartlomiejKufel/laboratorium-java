package Zadanie1;

public class Prostokat extends Figura{
    double wys=0, szer=0;

    public Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat( double wys, double szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }


    public double getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(int x, int y){
        punkt.x += x;
        punkt.y += y;
    }

    public String opis(){
        return super.opis()+" Prostokat. Wysokosc i szerokosc: "+wys+" "+szer;
    }


}
