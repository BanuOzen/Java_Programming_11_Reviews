package week_09;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        String[] array = {"java", "html", "css", "java", "javascript", "selenium"};
        String targetWord = "java";
        int res = countWordInArray(array, targetWord);
        System.out.println(res);




    }

    private static int countWordInArray(String[] array, String targetWord) {

        int counter = 0;

        for (String each : array) {
            if(each.equals(targetWord)){
                counter++;
            }
        }
        return counter;
    }

}
/*
Task 5 : Target Words
Given an Array of Strings and a target word (String) print how many
times the target word is in the Array
 Ex:
Input:
  ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output: 2
 */