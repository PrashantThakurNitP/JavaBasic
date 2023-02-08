
public class Person {
    private String name;
    private String email;
    private int age;
    private String phoneNumber;

    Person(String name, int age) {
        super();
        /*
         * first line of constructor is call to parent constructor
         * if default constuctor without args is not defined in parent / super class
         * then we explicity need to class parent constuctor by passing required no of
         * arg
         */
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
