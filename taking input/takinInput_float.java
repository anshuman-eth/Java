import java.util.Scanner;

public class takinInput_float {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st float nubmer:");
        float a = s.nextFloat();
        System.out.println("Enter 2nd float number:");
        float b = s.nextFloat();
        float sum = a+b;
        System.out.println("Sum of these two floats are: ");
        System.out.println(sum);
    }
}
