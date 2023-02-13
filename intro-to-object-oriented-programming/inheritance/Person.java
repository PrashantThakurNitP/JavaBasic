
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

    /*
     * Note
     * multiple inheritance is not defined in java unlike c++
     * class Dog extends Animal, Pet{
     * //will not work in java mutipe inhritance add lot of complexity in c++
     * 
     * }
     * 
     * we can have chain of relationship like this in java
     * class Animal{
     * }
     * class Pet Extends Animal{
     * }
     * class Dog Extends Pet{
     * }
     * Pet get class feature of Animal which itself get all property of Oject class
     * Dog get all those feature from Pet class
     */

    /*
     * we can have super cass refrence variable that can hold subclass reference
     * variable
     * Pet pet = new Dog(); //this allowed
     * but reverse is not allowed
     */

    /*
     * instanceof
     * pet instanceof Dog -> true
     * pet instanceof Animal -> true
     * pet instance of Object -> true
     * 
     * Animal animal = new Animal();
     * animal instanceof Pet -> false because animal super class and super class is
     * not instance of subclass
     * 
     * animal instanceof Object -> true
     */
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
