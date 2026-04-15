import java.util.*;

class Student implements Comparator<Student> {
    String name;
    int mark;
    int id;

    Student(String name, int mark, int id) {
        this.name = name;
        this.mark = mark;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.mark + " (ID: " + this.id + ")";
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }
}

public class ComparatorEG {
    public static void main(String[] args) {

        List<Student> s = new ArrayList<>();
        s.add(new Student("Alice", 85, 0));
        s.add(new Student("Bob", 90, 1));
        s.add(new Student("Charlie", 80, 2));
        s.add(new Student("David", 90, 3));
        Comparator<Student> byid = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.id - b.id;
            }
        };
        Collections.sort(s, (a, b) -> a.mark - b.mark);
        System.out.println("Students sorted by mark:");
        for (Student st : s) {
            System.out.println(st);
        }
        Collections.sort(s, byid);
        System.out.println("Students sorted by ID:");
        for (Student st : s) {
            System.out.println(st);
        }

    }
}