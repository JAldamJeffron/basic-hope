class leetcode520 {
    public boolean detectCapitalUse(String word) {
        int i=0,c=0;
        while(i<word.length()){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                c++;
            }
            i++;
        }
            if(c==word.length()) return true;
            else if (c==0) return true;
            else if(c==1 && word.charAt(0)>='A' && word.charAt(0)<='Z') return true;
            return false;
    }

    public static void main(String[] args) {
        leetcode520 sol = new leetcode520();
        System.out.println(sol.detectCapitalUse("USA")); // true
        System.out.println(sol.detectCapitalUse("leetcode")); // true
        System.out.println(sol.detectCapitalUse("Google")); // true
        System.out.println(sol.detectCapitalUse("FlaG")); // false
    }
}