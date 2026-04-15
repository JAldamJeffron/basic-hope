import java.util.*;

public class frequencysort {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        String str = "tree";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue();
                }
                return a.getKey() - b.getKey();
            }

        });

        for (Map.Entry<Character, Integer> i : list) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

    }
}