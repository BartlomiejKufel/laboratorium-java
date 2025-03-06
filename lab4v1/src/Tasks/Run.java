package Tasks;

import InputData.InputData;
import InputData.RandomValue;

import java.util.Arrays;

public class Run {
    InputData inputData= new InputData();
    TasksLab04v1 tasks04v1 = new TasksLab04v1();

    public void Start() {
        Menu();
    }

    private void Menu() {
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("5. Zadanie 5");
        System.out.println("6. Zadanie 6");
        System.out.println("7. Zadanie 7");
        System.out.println("8. Wyjście");
        System.out.println("Wybierz zadanie: ");
        int choose = inputData.InputInt();
        switch (choose){
            case 1: Task001Run(); break;
            case 2: Task002Run(); break;
            case 3: Task003Run(); break;
            case 4: Task004Run(); break;
            case 5: Task005Run(); break;
            case 6: Task006Run(); break;
            case 7: Task007Run(); break;
            case 8: CloseProgram(); break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie."); break;
        }


    }

    private void Task001Run() {
        System.out.println("Podaj przedziały do wylosowania");
        int limit1 = inputData.InputInt();
        System.out.println("Podaj zamknięcie przedziału do wylosowania");
        int limit2 = inputData.InputInt();

        System.out.println("Podaj ilość liczb do wylosowania z przedziału ["+limit1+", "+limit2+"]");
        int amount = inputData.InputInt();

        int[] array = RandomValue.RandValue(limit1, limit2, amount);
        System.out.println("Tablica:\n"+Arrays.toString(array));

        System.out.println("Suma liczb w tablicy: "+tasks04v1.Task01v1(array));
        System.out.println("Średnia liczb w tablicy: "+tasks04v1.Task01v2(array));
    }

    private void Task002Run() {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5,6,7,8,9};
        System.out.println("Tablica 1: "+Arrays.toString(array1));
        tasks04v1.Task02(array1);

        System.out.println("Tablica 2: "+Arrays.toString(array2));
        tasks04v1.Task02(array2);

    }

    private void Task003Run() {
        String[] array = {"cos", "ktoś", "jest", "być", "nie", "tak"};
        System.out.println("Tablica:\n"+Arrays.toString(array));

        tasks04v1.Task03(array);
    }

    private void Task004Run() {
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj słowo do tablicy: ");
            array[i] = inputData.InputString();
        }

        System.out.println("Tablica przed:\n"+Arrays.toString(array));

        String[] array_reverse = tasks04v1.Task04(array);
        System.out.println("Tablica po:\n"+Arrays.toString(array_reverse));

    }

    private void Task005Run() {
        System.out.println("Sortowanie Bąbelkowe:");

        int[] array = {-2, 8, 665, -1200, 48215, 0, 1};
        System.out.println("Tablica przed sortowaniem:\n"+Arrays.toString(array));

        int[] sorted_array = tasks04v1.Task05(array);
        System.out.println("Tablica po sortowaniu:\n"+Arrays.toString(sorted_array));

    }

    private void Task006Run() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj liczbę do tablicy: ");
            array[i] = inputData.InputInt();
        }

        System.out.println("Tablica przed !:\n"+Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = tasks04v1.Task06(array[i]);
        }
        System.out.println("Tablica po !:\n"+Arrays.toString(array));

    }

    private void Task007Run() {
        String[] array1 = {"cos", "ktos", "gdzies"};
        String[] array2 = {"cos", "ktos", "gdzies"};

        System.out.println("Tablica 1: "+Arrays.toString(array1));
        System.out.println("Tablica 2: "+Arrays.toString(array2));

        if(tasks04v1.Task07(array1, array2)){
            System.out.println("tablice są identyczne");
        }else{
            System.out.println("tablice się różnią");
        }
    }

    private void CloseProgram() {
        System.out.println("Dziękujemy za korzystanie z programu.");
    }


}
