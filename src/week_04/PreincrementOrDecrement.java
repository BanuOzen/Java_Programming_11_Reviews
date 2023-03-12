package week_04;

public class PreincrementOrDecrement {
    public static void main(String[] args) {
        int a=10;
        int b=++a;//11 //first increase the value then you can do your job later


        System.out.println(b);

        int c=--b; //10

        System.out.println(b--);
        System.out.println("b="+b);

        System.out.println(c);


    }
}
