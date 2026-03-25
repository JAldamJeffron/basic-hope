class leetcode1768 {
    public String mergeAlternately(String word1, String word2) {
        char c1[]=word1.toCharArray();
        char c2[]=word2.toCharArray();
        int n=c1.length;
        int m=c2.length;
        char c3[]=new char[m+n]; 
        int i=0,j=0,c=0,k=0;
        while(c<(m+n)){
            if(i<c1.length){
                c3[k++]=c1[i];
                i++;
            }
            if(j<c2.length){
                c3[k++]=c2[j];
                j++;
            }
            c++;
        }
        return new String(c3);
    }

    public static void main(String[] args) {
        leetcode1768 solution = new leetcode1768();
        String word1 = "abc";
        String word2 = "pqr";
        String result = solution.mergeAlternately(word1, word2);
        System.out.println("Word1: " + word1);
        System.out.println("Word2: " + word2);
        System.out.println("Merged: " + result);
    }
}
