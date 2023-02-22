import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingComparartor implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return Integer.compare(o2.getId(), o1.getId());
    }

}

class AscendingComparartor implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return Integer.compare(o1.getId(), o2.getId());
    }

}

public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(2, "Somesh"), new Student(12, "Ankit"), new Student(2, "Amir"),
                new Student(13, "Dheeraj"),
                new Student(4, "Julian"));
        System.out.println(students);
        List<Student> arStudents = new ArrayList<>(students);
        Collections.sort(arStudents); // in sort static method we can pass only those type of object which implement
                                      // comparable like sequence of integer allow sort as it has Comparable
                                      // implemetation
        System.out.println(arStudents);

        Collections.sort(arStudents, new DescendingComparartor()); // in sort static method we can pass only those type
                                                                   // of object which implement
        // comparable like sequence of integer allow sort as it has Comparable
        // implemetation
        System.out.println("Descending" + arStudents);

        arStudents.sort(new AscendingComparartor()); // sort method on list

        System.out.println("Ascending" + arStudents);

    }

}
