import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Catherine");

        // Filter names that start with 'C' and transform them to uppercase
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Processing with Streams!");
        System.out.println("Original names: " + names);
        System.out.println("Filtered names (Start with C, Uppercase): " + filteredNames);
    }
}
