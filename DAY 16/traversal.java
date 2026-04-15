import java.util.*;

public class traversal {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // l.remove(4);
        // System.out.print(l);
        ListIterator<Integer> it = l.listIterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current == 4) {
                it.remove();
            }
        }
        System.out.print(l);
        while (it.hasPrevious()) {
            int prev = it.previous();
            System.out.print(prev);
        }

    }
}