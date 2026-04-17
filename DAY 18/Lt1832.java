public class Lt1832 {
    public static void main(String[] args) {
        Lt1832 obj = new Lt1832();
        System.out.println("Lt1832 Output: " + obj.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for (char ch : sentence.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] <= 0) {
                return false;
            }
        }
        return true;
    }
}
