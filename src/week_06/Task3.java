package week_06;

public class Task3 {
    public static void main(String[] args) {

        String word="Cydeo";
        String result="";

        for (int i = 0; i <word.length() ; i++) {
            //I need to get each char one by one
            char each=word.charAt(i);
            //I need to append x after each char
            result+=each+"x";

        }
        System.out.println(result);

        String dec=result.replace("x","");
        System.out.println(dec);

    }
}
/*
Task 3: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
 */