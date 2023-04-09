package week_08;

public class Task4 {
    /*
    Task 4 :  Write a method that return the absolute
    difference between n and 21, except return double
    the absolute difference if n is over 21. (n is int)

    method  parameter : no , or what kind of data type --- integer
    method return type : void? --- integer


             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4
`
     */
    public static void main(String[] args) {
        int result = diff21(23);

        System.out.println(result);




    }

    public static int diff21(int number) {
        if(number<21){
            return 21-number;
        }else{
            return (number-21)*2;
        }


    }
}
