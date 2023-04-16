package week_09;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String[] array = { "123", "34", "513"};

        int[] res = getSum(array);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getSum(String[] array){
        int[] result = new int[array.length];
    int index = 0;
        for (String each : array) {
    int sum = 0;
            for (String eachDigit : each.split("")) {
                sum+=Integer.parseInt(eachDigit);
            }

            result[index++]=sum;
        }

        return result;
    }

}
/*
Task 3 : String numbers to sum

Given an Array of numbers in String format, add each digit of each element and store into a different Array.

Ex:

    Input:
        "123", "34", "513"

   Output:
        [ 6, 7, 9 ]
 */