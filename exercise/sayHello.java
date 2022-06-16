package exercise;

import java.util.Scanner;

public class sayHello {
    public static void main(String[] args) {
        System.out.println("What is your name:");
        Scanner s = new Scanner(System.in);
        String st=s.next();
        // System.out.print("Hello ");
        // System.out.print(st);
        // System.out.println(" how are you.");
        System.out.println("Hello "+ st + " how are you.");
    }
}
