import java.math.BigDecimal;

public class PersonRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Prashant", 24, "Software Developer");
        // employee.setName("Prashant");
        // employee.setAge(24);
        // employee.setTitle("asde2");
        employee.setEmployerName("Publicis Sapient");
        employee.setEmployeeGrade('A');
        employee.setSalary(BigDecimal.valueOf(2000000.6521));
        System.out.println(employee.toString());

        Student student = new Student("Avinash", 15, "NIT PATNA");
        student.setYear(2);
        System.out.println(student);
    }

}
