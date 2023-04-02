package week_07;

public class Task3 {
    public static void main(String[] args) {
        // create an array with elements
        String[] array = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus",
                "Mehmet","Asya"};
        // we will get each element
       int counter =0;
        for(String s :array){
            s = s.toLowerCase();
            // we will get the first char
            //String first = s.charAt(0) + ""; //s.substring(0,1)
            char first = s.charAt(0);
            //we will get the last char
            //String last = s.charAt(s.length()-1) + ""; //s.substring(s.length()-1)
            char last = s.charAt(s.length()-1);
            //we will compare if the last and first equal count the word
            if(first==last)
            //if(first.equalsIgnoreCase(last))
                counter++;

        }
        System.out.println(counter);





    }
}
/*
Task 3 : Write a program that accepts String array.
Count how many names have the same first and last letter

 Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus",
 "Mehmet","Asya"

 Output : 4

 */