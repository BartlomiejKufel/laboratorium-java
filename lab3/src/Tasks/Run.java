package Tasks;

import InputData.InputData;
import InputData.RandomValue;

import java.util.Arrays;

public class Run {
    TasksLab03 task03 = new TasksLab03();
    InputData input = new InputData();

    public void Start(){
        Menu();
    }

    private void Menu() {
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("5. Zadanie 5");
        System.out.println("6. Wyjście");
        System.out.println("Wybierz zadanie: ");
        int choose = input.InputInt();
        switch (choose){
            case 1: Task01Run(); break;
            case 2: Task02Run(); break;
            case 3: Task03Run(); break;
            case 4: Task04Run(); break;
            case 5: Task05Run(); break;
            case 6: CloseProgram(); break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie."); break;
        }
    }

    private void Task01Run() {
        System.out.println("Podaj liczbę studentów");
        int n = input.InputInt();
        int [] points = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Liczba punktów "+(i+1)+" studenta: ");
            points[i] = input.InputInt();
        }

        System.out.println("\nŚrednia liczba punktów w grupie: "+ task03.Task01(points, n));

    }

    private void Task02Run() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Podaj liczbę: ");
            array[i] = input.InputInt();
        }

        System.out.println("Ilość liczb dodatnich: "+ task03.Task02v1(array));
        System.out.println("Ilość liczb ujemnych: "+ task03.Task02v2(array));

    }

    private void Task03Run() {
        System.out.print("Podaj n:");
        int n = input.InputInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i+1;
        }
        System.out.println("\nCiąg:\n"+ Arrays.toString(array));
        System.out.println("Suma liczb parzystych w ciągu: "+task03.Task03(array));
    }

    private void Task04Run() {
        int[] array = RandomValue.RandValue(-10, 45, 5);

        System.out.println("\nCiąg:\n"+ Arrays.toString(array));
        System.out.println("Suma liczb parzystych w ciągu: "+task03.Task03(array));
    }

    private void Task05Run() {
        System.out.println("Podaj słowo do sprawdzenia");
        String word = input.InputString();

        if(task03.Task05(word)){
            System.out.println("Słowo "+word+" jest palindromem");
        }else{
            System.out.println("Słowo "+word+" nie jest palindromem");
        }
    }

    private void CloseProgram() {
        System.out.println("Dziękujemy za korzystanie z programu");
    }
}
