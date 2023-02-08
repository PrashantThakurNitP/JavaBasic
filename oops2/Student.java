
public class Student extends Person {

    /*
     * student inherit person person is called super class and student is called
     * 
     * subclass
     * 
     * subclass get all feature of supercass ie method and behaviour
     * it promote
     * code reusability
     * inheritance is called is a relationship ie student is a person
     * 
     * Any class which donot extends anythings extends object class
     * multiple property like equls hashcode toString are inherited by default from
     * object
     * class
     * object class is root of hierarchy
     * print person -> print person.toString()
     * 
     * in subclass we can override method from parent class
     */
    private String collegeName;
    private int year;

    Student(String name, int age, String collegeName) {
        super(name, age);
        this.collegeName = collegeName;

    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {

        return String.format("Name %s, Age %d, College Name Name %s, Year %d", super.getName(),
                getAge(), getCollegeName(), getYear(), getYear());
    }
}
