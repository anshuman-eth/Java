import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.println("It works");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = s.nextInt();
        System.out.println("Enter number 2");  
        int b = s.nextInt();
        int sum = a + b;
        System.out.print("the sum is these two numbers are :");
        System.out.println(sum);
    }
}
