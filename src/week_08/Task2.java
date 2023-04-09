package week_08;

public class Task2 {
    /*
     Write a method that can check if a number is prime or not

Note : Prime numbers are special numbers, greater than 1,
that have exactly two factors, themselves and 1
// 2 is prime number
     */
    public static void main(String[] args) {
// if the number is prime true else false
      boolean result = isPrime(5);
      boolean result2 = isPrime(8);
        System.out.println(result);
        System.out.println(result2);


    }

    /**
     *
     * @param number
     * @return boolean
     */
    public static boolean isPrime(int number) {

        if(number<2){
            return false;
        }
        if(number==2){
            return true;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if(number % i == 0){
                isPrime=false;
                break;
            }
        }

        return isPrime;



    }
}
