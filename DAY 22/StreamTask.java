import java.util.Arrays;
import java.util.List;

public class StreamTask {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Task: Find the average of all numbers greater than 20 using Streams
        double average = numbers.stream()
                .filter(n -> n > 20)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Numbers: " + numbers);
        System.out.println("Average of numbers greater than 20 is: " + average);
    }
}
