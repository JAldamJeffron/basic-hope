import java.util.*;

class Test {
    public static List<Character> Freq(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        return list;

    }

    public static List<Character> Fre(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue();
                }
                return a.getKey() - b.getKey();
            }
        });

        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> m : list) {
            result.add(m.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Character> l = new ArrayList<>(Fre("tree"));
        System.out.print(l);
    }
}