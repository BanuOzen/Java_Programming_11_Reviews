package week_05;

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter the first number");
        int firstValue=scanner.nextInt();

        System.out.println("Please enter the second number");
        int secondValue=scanner.nextInt();

        System.out.println("Total of number is "+ (firstValue + secondValue));
        scanner.close();




    }
}
