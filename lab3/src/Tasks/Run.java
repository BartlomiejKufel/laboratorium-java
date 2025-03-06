package Tasks;

import InputData.InputData;

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
        System.out.println("7. Wyjście");
        System.out.println("Wybierz zadanie: ");
        int choose = input.InputInt();
        switch (choose){
            case 1: Task01Run(); break;
            case 2: Task02Run(); break;
            case 3: Task03Run(); break;
            case 4: Task04Run(); break;
            case 5: Task05Run(); break;
            case 7: CloseProgram(); break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie."); break;
        }
    }

    private void Task01Run() {
        
    }

    private void Task02Run() {
        
    }

    private void Task03Run() {
        
    }

    private void Task04Run() {
        
    }

    private void Task05Run() {
        
    }

    private void CloseProgram() {
        System.out.println("Dziękujemy za korzystanie z programu");
    }
}
