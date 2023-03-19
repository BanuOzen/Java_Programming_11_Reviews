package week_05;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
                 //  01234567
        String str ="ABCDEG";

        // how to get each char
        System.out.println(str.charAt(0));// first char which is A

        // how to get E
        System.out.println(str.charAt(4));

/*
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("F".charAt(0));

 */


        //how to learn how many char we have in a string

        System.out.println(str.length());

        //how to make letters lower case
        System.out.println(str.toLowerCase());

        // how to make the letters uppercase
        System.out.println(str.toUpperCase());

        // how to trim(delete) the spaces at the beginning and ending

        //            012345678
        String str1 =" ab cd   ";
        System.out.println(str1);
        System.out.println(str1.trim());//****beginning and ending this is important****

        System.out.println(str1.indexOf('b')); //2
        System.out.println(str1.indexOf(' ')); //0
        System.out.println(str1.indexOf('e')); //-1

        // how to find index of string in a string

        System.out.println(str1.indexOf("b c"));
        System.out.println(str1.indexOf("b cd"));

        // if you want to find the index of letters from end to start

        System.out.println(str1.lastIndexOf(' ')); //8

        // if you want to delete or replace some char or string

        System.out.println(str1.replace('a', 'z'));


        // '' we can ot use like this because there is no empty char
        //System.out.println(str1.replace(' ', ''));

        System.out.println(str1.replace(" ", ""));
        // delete or replace the first matching one

        System.out.println(str1.replaceFirst(" ", ""));

        // how we can get the part of the string//
                     //0123456
        String result="About 183,000,000 results (0.39 seconds)";
        System.out.println(result.substring(6, 16 + 1));

        // About 90,300,000 results (0.41 seconds)
        String result2 = "About 90,300,000 results (0.41 seconds)";
        int indexOfSpace = result.indexOf(' '); //5
        int indexOfFirstDigit = indexOfSpace+1;
        int indexOfResultWithSpaces = result.indexOf(" results")-1;
        System.out.println(result.substring(indexOfFirstDigit, indexOfResultWithSpaces));








    }
}
