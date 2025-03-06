package InputData;
import java.util.Scanner;


public class InputData {
    Scanner input = new Scanner(System.in);
    public int InputInt() {
        return input.nextInt();
    }

    public float InputFloat() {
        return input.nextFloat();
    }
    public double InputDouble() {
        return input.nextDouble();
    }
    public String InputString() {
        return input.next();
    }
    public boolean InputBoolean() {
        return input.nextBoolean();
    }
}