package week_09;

public class MethodOverloadingRules {
    public static void main(String[] args) {

        //number of parameters
        methodA(3);
        methodA(3,5);

        //different data types
        methodA(4,5);

        //sequence of parameter
        methodB(2,4.5);
        methodB(2.3,4);

       /* //return type
        int result = methodC(3,5);
                methodC(3,5);*/

    }
    /*
    public static int methodC(int i, int i1){

    }
    public static int methodC(int i, int i1){

    }

        */
    public static void methodA(int i){

    }
    public static void methodA(double i){

    }
    public static void methodA(int i, int ii){

    }
    public static void methodB(int i,double v){

    }
    public static void methodB(double i, int v){

    }



}
