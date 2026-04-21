interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("Result of addition (10 + 5): " + addition.operate(10, 5));
        System.out.println("Result of subtraction (10 - 5): " + subtraction.operate(10, 5));
    }
}
