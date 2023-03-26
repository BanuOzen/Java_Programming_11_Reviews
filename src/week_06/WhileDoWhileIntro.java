package week_06;

import java.util.Random;
import java.util.Scanner;

public class WhileDoWhileIntro {
    public static void main(String[] args) {

       // System.out.println("Do you want to play game?");

        Scanner scan =new Scanner(System.in);
        //String ans=scan.next();//yes or no
       /*
        if(ans.equals("Yes")){

        }

        */
       /* int hidden=6;
        while(ans.equals("Yes")){

            System.out.println("Try to know the number");
            int  number=scan.nextInt();

            if(number==hidden){
                System.out.println("Congrats you found");
                break;
            }

            System.out.println("Do you want to go on playing");
            ans=scan.next();

        */
        Random random =new Random();
        int hiddenNumber = random.nextInt(25);
        boolean flag=true;

        System.out.println("Game is starting");
        System.out.println("Try to find the number");

        do{
            int num=scan.nextInt();
            if(num==hiddenNumber){
                flag=false;
                System.out.println("Found the number");
            }else{
                System.out.println("Try to another number");
            }

        } while(flag);


    }
}
