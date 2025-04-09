package Lesson;

public class Prostokat extends Figura{
    double a;
    double b;
    public Prostokat(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double Pole() {
        return a*b;
    }

    @Override
    public double Obwod() {
        return (a*2) + (b*2);
    }
}
