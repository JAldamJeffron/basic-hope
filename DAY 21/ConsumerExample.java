import java.util.function.Consumer;

class Person {
    String name;
    int marks;

    Person(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Person> printPerson = p -> System.out.println(p.name + " scored " + p.marks);
        Person p = new Person("John", 90);
        printPerson.accept(p);
    }
}
