package week_05;

import java.util.Scanner;

public class FormWithScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name" );
        String name=scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your gender");
        String gender = scanner.nextLine();
        System.out.println("Please enter your job");
        String job =scanner.nextLine();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("job = " + job);












    }
}
