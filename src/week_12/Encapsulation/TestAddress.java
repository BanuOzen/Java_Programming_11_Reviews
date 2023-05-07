package week_12.Encapsulation;

import java.util.regex.Pattern;

public class TestAddress {
    public static void main(String[] args) {

        Address address1 = new Address("Stret1", "Bursa", 16000, "Turkey");

        System.out.println(address1);

        Address address2 = new Address(" ", "Bursa", 16000, "Turkey");
        System.out.println(address2);



    }
}
