
import java.math.BigDecimal;

public class Employee extends Person {

    private String title;
    private String employerName;
    private char employeeGrade;
    private BigDecimal salary;

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

        return String.format("Name %s, Age %d,Title %s, Employeer Name %s, Employeer grade %c", super.getName(),
                getAge(), getTitle(),
                getEmployerName(), getEmployeeGrade());
    }

}
