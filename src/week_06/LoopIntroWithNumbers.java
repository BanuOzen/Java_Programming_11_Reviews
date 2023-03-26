package week_06;

public class LoopIntroWithNumbers {
    public static void main(String[] args) {
        //print the numbers from 1 to 15
        for(int i=1; i<=15; i++){
            System.out.println(i);

        }
        System.out.println("-------------------");
        //print numbers from 50 to 100
        for (int i = 50; i <=100 ; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        //print the even numbers from 0 to 100(included)

        for (int i = 0; i <= 100 ; i++) {
            System.out.println(i);
        }
        System.out.println("****************");
        //print the even numbers from 1 to 99(included)
        for (int i = 1; i <= 99; i=i+2) {
            System.out.println(i);
        }
        System.out.println("****************");
        //print the numbers if the number is divisible by 5 from 0 to 1000(inc)
        for (int i = 0; i <=1000 ; i++) {
            if(i%5==0){
                System.out.println(i);
            }
        }


    }
}
/*
        for (init(start point); condition(exit rule) ; inc/dec{
          //implementation
}
 */
