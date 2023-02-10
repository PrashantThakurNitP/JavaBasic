import java.math.BigDecimal;

public class Employee extends Person {

    private String title;
    private String employerName;
    private char employeeGrade;
    private BigDecimal salary;

    /*
     * during creation of object of employee first constructor of super class person
     * is called then constructor of child class employee is called
     * from constuctor of class in first line constructor of super class is called
     */
    Employee(String name, int age, String title) {
        super(name, age);
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    // super helps to get value from parent class

    @Override
    public String toString() {

        return String.format("Name %s, Age %d,Title %s, Employeer Name %s, Employeer grade %c Salary %.3f",
                super.getName(),
                getAge(), getTitle(),
                getEmployerName(), getEmployeeGrade(), getSalary());
    }

}
