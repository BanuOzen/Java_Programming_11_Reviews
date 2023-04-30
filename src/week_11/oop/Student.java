package week_11.oop;



public class Student {
    public String firstName;
    public String lastName;
    public int age;
    //static public String course = "Cydeo";
    static public String course;
    static{
        course = "Cydeo";
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }






}
