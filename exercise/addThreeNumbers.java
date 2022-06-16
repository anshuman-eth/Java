package exercise;

import java.util.Scanner;

public class addThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 1st number");
        Scanner s1 =new Scanner(System.in);
        float a = s1.nextFloat();
        System.out.println("Enter 2nd number");
        Scanner s2 = new Scanner(System.in);
        float b =s2.nextFloat();
        System.out.println("Enter 3rd number");
        Scanner s3 = new Scanner(System.in);
        float c = s3.nextFloat();
        float sum = a+b+c;
        System.out.print("Total sum :");
        System.out.println(sum);
    }
}
