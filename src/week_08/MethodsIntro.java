package week_08;

public class MethodsIntro {
    public static void main(String[] args) {

        // my job is printing Hello Word 10 times



        repeatHelloWord10Times();
        //mac option + enter + enter
        // windows alt + enter +enter

        //sum3And5();
        sumAndPrintTwoNumber(3,5);
        sumAndPrintTwoNumber(20,56);

        // sum two number multiply result which is coming from method with 2
        int result = sumWithReturn(3,5);
        System.out.println(result*2);
    }

    public static int sumWithReturn(int num1, int num2) {

        return num1+num2;
    }


    public static void sumAndPrintTwoNumber(int num1, int num2) {
        System.out.println(num1+num2);
    }


    public static void repeatHelloWord10Times() {
        // we will implement the idea

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }



    }


}
