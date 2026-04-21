import java.util.function.Predicate;

class student {
    int marks;

    student(int marks) {
        this.marks = marks;
    }
}

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        System.out.println(isEven.test(30));

        // Predicate<Integer> isEven= (n)-> n%2==0;
        System.out.println(isEven.test(99999));
        Predicate<student> isPass = (s) -> s.marks >= 45;
        System.out.println(isPass.test(new student(60)));
    }
}