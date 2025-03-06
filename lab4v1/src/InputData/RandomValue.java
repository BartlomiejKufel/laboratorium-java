package InputData;

import java.util.Random;

public class RandomValue {
    public static int[] RandValue(int a, int b, int ilosc){
        Random rand = new Random();
        if(a>b){
            System.out.println("Początek przedziału nie może być większy od końca");
            return null;
        }

        if(ilosc < 0){
            System.out.println("Ilość nie może być liczbą ujemną");
            return null;
        }
        int[] values = new int[ilosc];

        for (int i = 0; i < ilosc; i++) {
            values[i] = rand.nextInt(b-a+1)+a;
        }

        return values;
    }
}
