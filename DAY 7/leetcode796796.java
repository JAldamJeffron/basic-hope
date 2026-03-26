class leetcode796796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return ((s+s).contains(goal));
    }

    public static void main(String[] args) {
        leetcode796796 sol = new leetcode796796();
        System.out.println(sol.rotateString("abcde", "cdeab")); // true
        System.out.println(sol.rotateString("abcde", "abced")); // false
    }
}

