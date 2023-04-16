package week_09;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        
        // I will try to sum two int number
        sum(3,2);


        // I will try to sum two double number
        sum(1.3,4.3);

        // I will try to sum two byte number
        sum((byte)3,(byte)4);

        sum(4L,5L);
        
        
    }
    
    public static void sum(int num1, int num2){
        System.out.println("int" + (num1+num2));
    }

    public static void sum(double num1, double num2){
        System.out.println("double" + (num1+num2));
    }
    public static void sum(byte num1, byte num2){
        System.out.println("byte" + (num1+num2));
    }
    
    
}
