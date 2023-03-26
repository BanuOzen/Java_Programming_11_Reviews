package week_06;

import java.util.Scanner;

public class WhileDoWhileIntro {
    public static void main(String[] args) {
        System.out.println("Do you want to play game?");
        Scanner scan =new Scanner(System.in);
        String ans=scan.next();//yes or no
       /*
        if(ans.equals("Yes")){

        }

        */
        int hidden=6;
        while(ans.equals("Yes")){

            System.out.println("Try to know the number");
            int  number=scan.nextInt();

            if(number==hidden){
                System.out.println("Congrats you found");
                break;
            }

            System.out.println("Do you want to go on playing");
            ans=scan.next();




        }


    }
}
