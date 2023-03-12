package week_04;

public class PostIncrementOrDecrement {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);

        System.out.println(a++);// 5 //first do your job then for next line you can increment

        System.out.println(a); //6

        System.out.println(a--); //first do your job then for next line you can decrement

        System.out.println(a);

        int b=10;

        System.out.println(b++);
        System.out.println(b--);
        System.out.println(b);

        System.out.println(b++ + b-- + b);//


    }
}
