package week_07;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        //split(String regex)
        //toCharArray()
        String str = "I  love  java";
        String[] words = str.split(" "); //{"A","d","a","m"}
        System.out.println(Arrays.toString(words)); //{'A','d','a','m'}
        int counter =0;
       for (String each:words){
           if(!each.isEmpty())
               counter++;
       }
        System.out.println(counter);
        System.out.println(words.length);
        System.out.println(words.length-counter);


        System.out.println("===========================");
        String name = "Adam";

        char[] charsOfName = name.toCharArray();
        System.out.println(Arrays.toString(charsOfName));

        //**************************************
        String name2 = new String(charsOfName);
        System.out.println(name2);
        //***************************************

        char [] name3 = {'E', 'L', 'I', 'F'};
        String na = new String(name3);
        System.out.println(na);


    }
}
