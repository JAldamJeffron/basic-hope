import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student s) {
        return this.mark - s.mark;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.mark;
    }
}

public class ComparableEG {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("Alice", 85));
        s.add(new Student("Bob", 90));
        s.add(new Student("Charlie", 80));
        Collections.sort(s);
        for (Student student : s) {
            System.out.println(student);
        }
    }
}