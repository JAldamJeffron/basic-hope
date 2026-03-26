class leetcode796 {
    public char[] reverse(int l,int r,char a[]){
        while(l<r){
            char temp =a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        return a;
    }
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        char chs[]=s.toCharArray();
        char go[]=goal.toCharArray();
        int n=chs.length;

        for(int k=0;k<n;k++){
            reverse(0,k-1,chs);
            reverse(k,n-1,chs);
            reverse(0,n-1,chs);

        String net=new String(chs);
        String goa=new String(go);

        if(net.equals(goa)){
            return true;
        }
        reverse(0,n-1,chs);
        reverse(0,k-1,chs);
        reverse(k,n-1,chs);
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode796 sol = new leetcode796();
        System.out.println(sol.rotateString("abcde", "cdeab")); // true
        System.out.println(sol.rotateString("abcde", "abced")); // false
    }
}

