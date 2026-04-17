import java.util.*;

public class lt819 {
    public static void main(String[] args) {
        lt819 obj = new lt819();
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println("lt819 Output: " + obj.mostCommonWord(para, banned));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String cleanstr = paragraph.toLowerCase();
        cleanstr = cleanstr.replaceAll("[^a-z]", " ");
        String[] words = cleanstr.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        int max = 0;
        String res = "";
        for (String s : words) {
            if (!set.contains(s) && s.length() > 0) {
                map.put(s, map.getOrDefault(s, 0) + 1);
                if (map.get(s) > max) {
                    max = map.get(s);
                    res = s;
                }
            }
        }
        return res;
    }
}
