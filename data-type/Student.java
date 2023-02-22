public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return String.format("name = %s, id = %d", name, id);
    }

    @Override
    public int compareTo(Student that) {

        return Integer.compare(this.id, that.id);
    }

}
