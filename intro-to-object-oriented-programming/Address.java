public class Address {
    private String line1;
    private String city;
    private String zip;

    Address(String line1, String city, String zip) {

        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return String.format("Line1 -> %s, City -> %s, Zip-> %s", line1, city, zip);
    }
}
