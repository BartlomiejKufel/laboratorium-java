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



    public void CloseProgram() {
        System.out.println("\nDziękujemy za korzystanie z naszego programu do widzenia :)");
    }
}
