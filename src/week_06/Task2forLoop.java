package week_06;

public class Task2forLoop {
    /*
    Task 2: Given a sentence which is string and count the words in it.

            input: String str="Java is java in everywhere is Java";
            output:7
*/

    public static void main(String[] args) {

        int counter=0;
        String str ="Java is java in everywhere is Java";

        for (int i = 0; i < str.length(); i++) {
            // we ed to get the each char
            char each = str.charAt(i);


            if(each==' ')
                counter++;
            // we need to compare that char is space or not if space we will increment the counter
        }
        if(str.isEmpty()){
            System.out.println(counter);
        }else{
            System.out.println(counter+1);
        }
    }
}
