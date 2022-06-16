package exercise;

import java.util.Scanner;

public class convertKmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the kilometer:");
        Scanner s =new Scanner(System.in);
        float km =s.nextFloat();
        double temp = 0.621371;
        double miles = km * temp;
        System.out.println("total miles=" + miles);

    }
}
