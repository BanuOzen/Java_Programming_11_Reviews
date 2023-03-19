package week_05;

public class SubstringExample {

    public static void main(String[] args) {

        String result="About 183,000,000 results (0.39 seconds)";

        String result1=result.substring(6);
        System.out.println(result1);

        int indexOfSpace=result1.indexOf(' ');
        System.out.println(result1.substring(0, indexOfSpace));

        String name ="Banu";
        // how to write your string as many as you want
       // System.out.println(name+name+name);

        System.out.println(name.repeat(5));

        // how you check your string is empty or not (length=0)
        String str3="";
        String str4=" ";
        System.out.println(str3.isEmpty());//true
        System.out.println(str4.isEmpty());//false


    }
}
