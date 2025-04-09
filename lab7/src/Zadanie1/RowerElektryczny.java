package Zadanie1;

public class RowerElektryczny extends Pojazd implements Elektryczny{
    private int poziomBaterii;

    public RowerElektryczny(String model, String id) {
        super(model, id);
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin*50;
    }

    @Override
    public int poziomNaladowania() {
        return poziomBaterii;
    }

    @Override
    public void naladuj() {
        poziomBaterii =100;
        System.out.println("Bateria naładowana");
    }


}
