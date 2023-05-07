package week_12;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
       // person.name = "1234";  We cut the connection between variable in oder to control it
        person.setName("Adam");
        // person.age = -12; We cut the connection between variable in oder to control it
        person.setAge(34);
        System.out.println(person);
        System.out.println(person.getAge());
        System.out.println(person.getName());


    }

}
