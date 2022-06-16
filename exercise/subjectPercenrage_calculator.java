package exercise;

import java.util.Scanner;

public class subjectPercenrage_calculator {
    public static void main(String[] args) {
        System.out.print("Enter the marks of Physics:");
        Scanner s1 =new Scanner(System.in);
        float p = s1.nextFloat();
        System.out.print("Enter the marks of Chemistry:");
        Scanner s2 = new Scanner(System.in);
        float c = s2.nextFloat();
        System.out.print("Enter marks of Maths:");
        Scanner s3 = new Scanner(System.in);
        float m = s3.nextFloat();
        System.out.print("Enter marks of English:");
        Scanner s4 = new Scanner(System.in);
        float e = s4.nextFloat();
        System.out.print("Enter marks of Hindi:");
        Scanner s5 = new Scanner(System.in);
        float h = s5.nextFloat();
        float t = p+c+m+h+e;
        float percentage = (t*100)/500;
        System.out.print("Total percentage:");
        System.out.println(percentage);
    }
}
