package Tasks;

public class TasksLab03 {

    //Zadanie 1
    public double Task01(int[] points, int n) {
        double sum =0;
        int i = 0;
        while (i < n) {
            sum += points[i];
            i++;
        }
        return (sum/n);
    }
    //Zadanie 2, liczby dodatnie
    public int Task02v1(int[] array) {
        int count =0;
        for (int i: array){
            if(i>0)
                count++;
        }
        return count;
    }
    //Zadanie 2, liczby ujemne
    public int Task02v2(int[] array) {
        int count =0;
        for (int i: array){
            if(i<0)
                count++;
        }
        return count;
    }
    //Zadanie 3 i 4
    public int Task03(int[] array) {
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0)
                sum+=array[i];
        }
        return sum;
    }

    //Zadanie 5
    public boolean Task05(String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i)!=word.charAt(word.length()-1-i))
                return false;
        }

        return true;
    }
}
