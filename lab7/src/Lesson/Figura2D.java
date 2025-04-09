package Lesson;
//To jest Kwadrat
public class Figura2D implements FiguraGeometryczna{
    double a=5;
    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return a*4;
    }
}
