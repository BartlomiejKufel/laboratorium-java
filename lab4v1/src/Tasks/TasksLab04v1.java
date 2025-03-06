package Tasks;

import java.util.Arrays;

public class TasksLab04v1 {
    /**
     *  Zadanie 1
     *  Funkcja obliczająca sumę
     **/

    public int Task01v1(int[] array) {
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        return sum;
    }

    /**
     *  Zadanie 1
     *  Funkcja obliczająca średnią
     **/
    public double Task01v2(int[] array) {
        double sum = Task01v1(array);
        return (sum/array.length);
    }

    //Zadanie 2
    public void Task02(int[] array) {
        for (int i = 0; i < array.length; i+=2) {
            if (i < array.length){
                System.out.println(array[i]);
            }
        }
    }

    //Zadanie 3
    public void Task03(String[] array) {
        for (String item: array){
            System.out.println(item.toUpperCase());
        }

    }

    //Zadanie 4
    public String[] Task04(String[] array) {
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            String tmp = "";
            for (int j = array[i].length()-1; j >= 0; j--) {
                tmp += array[i].charAt(j);
            }
            result[i] = tmp;
        }
        return result;
    }

    //Zadanie 5
    public int[] Task05(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int tmp = array[j-1];
                if (tmp > array[j]){
                    array[j-1] = array[j];
                    array[j] = tmp;
                }

            }
        }
        return array;
    }

    //Zadania 6
    public int Task06(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    public boolean Task07(String[] array1, String[] array2) {
        if(Arrays.equals(array1, array2)){
            return true;
        }
        return false;
    }
}
