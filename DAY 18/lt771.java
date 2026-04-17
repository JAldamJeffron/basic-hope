import java.util.HashSet;
import java.util.Set;

public class lt771 {
    public static void main(String[] args) {
        lt771 obj = new lt771();
        System.out.println("lt771 Output: " + obj.numJewelsInStones("aA", "aAAbbbb"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        // High-performance approach: 128-size boolean array covers all ASCII characters
        boolean[] isJewel = new boolean[128];
        int count = 0;
        
        // Mark all jewels as true
        for (char ch : jewels.toCharArray()) {
            isJewel[ch] = true;
        }
        
        // Check each stone
        for (char ch : stones.toCharArray()) {
            if (isJewel[ch]) {
                count++;
            }
        }
        return count;
    }
}
