package Tasks;
import java.text.DecimalFormat;

public class Run {
    InputData input = new InputData();
    TasksLab02 tasksLab02 = new TasksLab02();
    DecimalFormat df = new DecimalFormat("0.00");

    public void RunMenu(){
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
        int choose = input.InputInt();
        switch (choose){
            case 1: Task01Run(); break;
            case 2: Task02Run(); break;
            case 3: Task03Run(); break;
            case 4: Task04Run(); break;
            case 5: Task05Run(); break;
            case 6: Task06Run(); break;
            case 7: tasksLab02.CloseProgram(); break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie."); break;
        }
    }

    private void Task06Run() {
    }

    private void Task05Run() {
        
    }

    private void Task04Run() {
        
    }

    private void Task03Run() {
        
    }

    private void Task02Run() {
    }

    private void Task01Run() {
        System.out.println("Podaj swoje liczby:");
        System.out.print("a = ");
        double a = input.InputDouble();
        if(a == 0){
            System.out.println("a nie może być równe 0.");
            return;
        }
        System.out.print("b = ");
        double b = input.InputDouble();
        System.out.print("c = ");
        double c = input.InputDouble();

        System.out.print("Twoje równanie:\n"+df.format(a)+"x^2");
        if(b > 0){System.out.print(" + "+df.format(b)+"x");}
        else{System.out.print(" "+df.format(b)+"x");}
        if(c > 0){System.out.print(" + "+df.format(c));}
        else{System.out.print(" "+df.format(c)+"\n");}

        tasksLab02.Task01(a,b,c);
    }
}
