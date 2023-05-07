package week_12.Encapsulation;

public class Address {

    private String street;
    private String city;
    private int zipCode;
    private String country;

    public Address(String street, String city, int zipCode, String country) {
        setStreet(street);
        this.city = city;
        setZipCode(zipCode);
        this.country = country;
    }

    public void setStreet(String street) {
        // if the street name isEmpty or street length is bigger than 50
        if( street.isBlank() || street.isEmpty() || street.length() > 50 ){
            if(street.isEmpty() || street.isBlank()){
                System.out.println("You can not use empty street name ");
            }else{
                System.out.println("You can not use street name length bigger than 50");
            }
            System.exit(0);
        }else {
            this.street = street;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        //if( zipcode >= 10000 && zipcode <= 99999){
        if( ( zipCode + "").length() == 5 ){
            this.zipCode = zipCode;
        }else{
            System.out.println("You can not use zipcode length other that 5 ");
            System.exit(0);
        }

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                '}';
    }
}
