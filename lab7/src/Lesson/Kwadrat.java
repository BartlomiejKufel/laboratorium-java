package Lesson;

public class Kwadrat extends Figura{
    double a;

    public Kwadrat(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }

}
