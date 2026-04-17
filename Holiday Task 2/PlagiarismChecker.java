import java.util.*;

public class PlagiarismChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Document 1:");
        String text1 = sc.nextLine();
        System.out.println("Enter Document 2:");
        String text2 = sc.nextLine();
        checkPlagiarism(text1, text2);
        sc.close();
    }

    public static void checkPlagiarism(String text1, String text2) {

        text1 = text1.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        text2 = text2.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] words1 = text1.trim().split("\\s+");
        String[] words2 = text2.trim().split("\\s+");
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (String w : words1) {
            if (!w.isEmpty()) {
                set1.add(w);
            }
        }
        for (String w : words2) {
            if (!w.isEmpty()) {
                set2.add(w);
            }
        }

        Set<String> commonSet = new HashSet<>(set1);
        commonSet.retainAll(set2);
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        Set<String> diffSet = new HashSet<>(unionSet);
        diffSet.removeAll(commonSet);

        double similarity = 0;
        if (unionSet.size() != 0) {
            similarity = ((double) commonSet.size() / unionSet.size()) * 100;
        }
        List<Word> commonList = new ArrayList<>();
        List<Word> diffList = new ArrayList<>();

        for (String w : commonSet) {
            commonList.add(new Word(w));
        }
        for (String w : diffSet) {
            diffList.add(new Word(w));
        }
        Collections.sort(commonList);
        Collections.sort(diffList);

        System.out.println("\nANALYSIS RESULT:-");
        System.out.println("Similarity Score:" + String.format("%.2f", similarity) + "%");
    }
}

class Word implements Comparable<Word> {
    String value;

    public Word(String value) {
        this.value = value.toLowerCase();
    }

    public int compareTo(Word other) {
        return this.value.compareTo(other.value);
    }

    public String toString() {
        return value;
    }
}