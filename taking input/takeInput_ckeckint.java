import java.util.Scanner;

public class takeInput_ckeckint {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        boolean b = s.hasNextInt();
        System.out.println(b);
    }
}
