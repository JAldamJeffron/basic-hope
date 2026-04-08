import java.util.*;

public class Listduplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 56, 4, 3, 2, 3, 1, 2));
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
    }
}