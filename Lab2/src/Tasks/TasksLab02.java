package Tasks;

public class TasksLab02 {

    public void Task01(double a, double b, double c){
        double delta = (b*b)+(a*c*(-4));

        if(delta < 0){
            System.out.println("Równanie nie ma rozwiązań");
        }
        else if ( delta > 0) {
            double x1 = ((-b) - Math.sqrt(delta))/(2*a);
            double x2 = ((-b) + Math.sqrt(delta))/(2*a);

            System.out.println("Równanie ma 2 rozwiązania:\nx1 = "+x1+", x2 = "+x2);
        }
        else{
            double x = (-b)/(2*a);
            System.out.println("Równanie ma 1 rozwiązanie:\nx0 = "+x);
        }
    }


    public void Task02(double xa, double xb, double xc){
        System.out.println("a("+xa+") = "+ FunctionAX(xa));
        System.out.println("b("+xb+") = "+ FunctionBX(xb));
        System.out.println("c("+xc+") = "+ FunctionCX(xc));
    }

    private double FunctionCX(double x) {
        if(x>2){
            return (2+x);
        } else if (x==2) {
            return 8;
        }else{
            return (x-4);
        }
    }

    private double FunctionBX(double x) {
        if (x >=1){
            return (x*x);
        }
        else {
            return x;
        }
    }

    private double FunctionAX(double x) {
        if(x>0){
            return (2*x);
        } else if (x==0) {
            return 0;
        }else {
            return (-3*x);
        }
    }


    public void Task03(int x, int y, int z){
        int[] tab = {x,y,z};

        for (int i = 1; i < 3; i++) {
            if(tab[i] < tab[i-1]){
                int tmp = tab[i];
                tab[i] = tab[i-1];
                tab[i-1] = tmp;
            }
        }

        System.out.println("Liczby przed sortowaniem");
        System.out.println("["+tab[0]+", "+tab[1]+", "+tab[2]+" ]");
    }


    public void Task04(boolean rain, boolean bus) {
        if (rain && bus){
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if (rain && !bus) {
            System.out.println("Nie dostaniesz się na uczelnie");
        } else if (!rain && bus) {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pięknej pogody");
        }

    }

    /*
    Ok jeśli chodzi o tą funkcję to tak
    jeśli wpiszesz true false - wykona się 2 if
    jeśli wpiszesz coś innego wykona się 1 if
    nigdy nie wykona się 3 if
     */
    public void Task05(boolean discount, boolean raise) {
        if(!discount || raise){
            System.out.println("Możesz kupić samochód!");
            System.out.println("Zniżki na samochód nie ma");
        } else if (!discount || !raise) {
            System.out.println("Zakup samochodu trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        } else if (discount || raise) {
            System.out.println("Możesz kupić samochód");
        }

    }

    public void CloseProgram() {
        System.out.println("\nDziękujemy za korzystanie z naszego programu do widzenia :)");
    }

    public void Task06(double x, double y, int choice) {
        switch (choice){
            case 1: System.out.println("x + y = "+ (x+y));break;
            case 2: System.out.println("x - y = "+ (x-y));break;
            case 3: System.out.println("x * y = "+ (x*y));break;
            case 4:
                if(y == 0){
                    System.out.println("Nie można dzielić przez zero");
                    break;
                }
                System.out.println("x / y = "+ (x/y));break;
            case 5:
                if(y == 0){
                    System.out.println("Nie można dzielić przez zero");
                    break;
                }
                double t = x%y;
                System.out.println("x % y = "+ t);break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie."); break;
        }
    }
}
