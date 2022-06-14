import java.util.Scanner;

public class takeInput_string {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner s = new Scanner(System.in);
        // String st = s.next();
        String st = s.nextLine();
        System.out.println(st);
    }
}
