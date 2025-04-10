import java.util.*;


public class Main {

    public static int silnia(int x){
        int iloczyn=1;

        try{
            if (x < 0){
                throw new IllegalArgumentException("Nie można dawać liczby ujemnej");
            }

            for (int i = 1; i <= x; i++) {
                iloczyn *=i;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return iloczyn;
    }




    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

//Zad1
        /*
        System.out.println("Podaj liczba: ");
        try{
            String txt = scanner.next();
            double liczba = Double.parseDouble(txt);
            if(liczba < 0){
                throw new IllegalArgumentException("Nie można obliczbyć pierwsiastka z liczby ujemnej");
            }
            double pierwiastek = Math.sqrt(liczba);
            System.out.println("Pierwiastek = "+pierwiastek);


        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
         */
//Zad 2
//        int x = -10;
//        int silniaX = silnia(x);
//        System.out.println("Silnia jest równa = "+silniaX);

        //Zad3
        try {
            Adres adres = new Adres(null, 0, null, null);
        }catch (Adres.NieprawidlowyAdresException e){
            System.out.println(e.getMessage());
        }
    }
}