package week_11.oop;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student("Ramazan", "Mert", 18);
        Student student2 = new Student("Furkan", "Ozturk", 20);
        Student student3 = new Student("Pazilya", "Jurat", 22);
        Student student4 = new Student("Ahmet", "Celik", 25);
        Student student5 = new Student("Adel", "Mohsen", 18);

        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(student1, student2, student3, student4, student5));
        System.out.println(students);
        System.out.println("=========================");

        ArrayList<Student> res = getStudentsNameStartWithA(students,"A");
        System.out.println(res);

        System.out.println("========================");
        ArrayList<Student> resultForAge = getStudentsAgeGreaterThan(students,22);

        System.out.println(resultForAge);

    }

    private static ArrayList<Student> getStudentsAgeGreaterThan(ArrayList<Student> students, int age) {
        ArrayList<Student> resultForAge = new ArrayList<>();
        // we need to get the each student
        for (Student student : students) {
            // we need to get the each student age
            int tempAge = student.age;
            // if the student age is the greater than given age
            if(tempAge >= age){
                resultForAge.add(student);
            }
            //we need to put that student in empty list

        }
        return resultForAge;
    }


    private static ArrayList<Student> getStudentsNameStartWithA(ArrayList<Student> students, String prefix) {
        // we need to create empty list of student
        ArrayList<Student> result = new ArrayList<>();
        // we need to get the each student
        for (Student student : students) {
            // we need to get the each student name
            String tempName = student.firstName;
            // if the student name is starting with prefix
            if(tempName.startsWith(prefix)){
                result.add(student);
            }
            //we need to put that student in empty list

        }
        return result;











    }
}
/*
- create a class which is School with main method

- create a list of student in School class

- create a method in School class which is getting
 list of students as parameter the return the list of
 students if the name start with "A"
 */