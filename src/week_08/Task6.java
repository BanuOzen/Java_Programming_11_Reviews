package week_08;

import java.util.Arrays;

public class Task6 {
    /*
    Write a program that accepts String array.
    Count how many names have the same first and last letter

Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"
Output : 4
     */

    public static void main(String[] args) {
        String[] array = { "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        int result = countWords(array);
        System.out.println(result);
        getWordsFirstAndLastCharSame(array);


    }

    public static int getWordsFirstAndLastCharSame(String[] array) {

        int arraySize = countWords(array);
        int result=0;
        String[] resultArr = new String[arraySize];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            String each =array[i];
            String temp = each.toLowerCase();

            char firstLetter = temp.charAt(0);
            char lastLetter = temp.charAt(temp.length()-1);

            if(firstLetter==lastLetter){

              resultArr[index++]=each;
            }
        }return result;



    }

    public static int countWords(String[] array) {
        int counter = 0;
        for (String each : array) {

            String temp =each.toLowerCase();

            char firstLetter = temp.charAt(0);
            char lastLetter = temp.charAt(temp.length()-1);

            if(firstLetter==lastLetter){
                counter++;
            }


        }
        return counter;



    }
}
