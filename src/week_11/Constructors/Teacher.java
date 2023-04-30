package week_11.Constructors;

public class Teacher {

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
