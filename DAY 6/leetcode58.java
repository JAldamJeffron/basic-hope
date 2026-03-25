class leetcode58 {
    public int lengthOfLastWord(String s) {
        String c=s.trim();
        int count=0;
        int i=c.length()-1;
        while(i>=0 && c.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode58 solution = new leetcode58();
        String s = "   Hello World   ";
        int result = solution.lengthOfLastWord(s);
        System.out.println("Input: '" + s + "'");
        System.out.println("Length of last word: " + result);
    }
}

