package week_08;

public class Task1 {
    /*
    Tasks:

    Task 1 :   Write a method that can check if a number is even or odd
     */
    public static void main(String[] args) {

        // we will create a method then we will provide a number then it will return even or odd

       String result =  checkNumberEvenOrOdd(3);
        System.out.println(result);
    }

    public static String checkNumberEvenOrOdd(int number) {

        return (number%2==0) ? "Even":"Odd";
       /* if(number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }

        */
       /* String result ="";
        if(number%2==0){
            result="even";
        }else{
            result ="Odd";
        }
        return result;

        */
    }


}
