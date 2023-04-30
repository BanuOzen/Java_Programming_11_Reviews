package week_11.Constructors;

import java.util.Scanner;

public class CustomClasses {
    public static class Teacher {

        public String name;
        public int age;
        public char gender;

        public Teacher(String name, int age, char gender) {
           // this.name = name;
           // this.age = age;
            this(name, age);
            this.gender = gender;
        }
        public Teacher(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Teacher(){

        }

        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    public static class TestTeacher {
        public static void main(String[] args) {

            Teacher teacher1 = new Teacher("Adam", 34, 'M');

            Teacher teacher2 = new Teacher("Aysun", 25);

            System.out.println(teacher1);

            teacher2.gender = 'F';
            System.out.println(teacher2);


            Teacher teacher3 = new Teacher();
            Scanner scanner =  new Scanner(System.in);

            System.out.println("Enter teacher name");
            teacher3.name = scanner.nextLine();

            System.out.println("Enter teacher age");
            teacher3.age = scanner.nextInt();

            System.out.println("Enter teacher gender");
            teacher3.gender = scanner.next().charAt(0);

            System.out.println(teacher3);



        }
    }
}
