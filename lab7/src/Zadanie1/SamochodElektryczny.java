package Zadanie1;

public class SamochodElektryczny extends Pojazd implements Elektryczny{
    private int poziomBaterii=0;

    public SamochodElektryczny(String model, String id) {
        super(model, id);
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin*30.6;
    }

    @Override
    public int poziomNaladowania() {
        return poziomBaterii;
    }

    @Override
    public void naladuj() {
        poziomBaterii =100;
        System.out.println("Bateria naładowana!");
    }
}
