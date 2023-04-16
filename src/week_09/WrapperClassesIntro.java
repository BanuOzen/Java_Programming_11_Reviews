package week_09;

import java.util.ArrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int[] array ={1,2,5,3};
        String[] array2 = {"1","2","5","3"};
        // We can not use primitive data types with collections so
        // we have a problem but the solution is using
        // Wrapper Classes Which are Integer,Boolean,Double,......
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 2- We have some methods in wrapper classes for making our job easy


        //isDigit()

        char ch = '2';
        System.out.println(Character.isDigit(ch));

        //isLetter()
        System.out.println(Character.isUpperCase('a'));

        //parseInt()  ---->is returning primitive



        //valueOf()  ------> is returning object





    }
}
