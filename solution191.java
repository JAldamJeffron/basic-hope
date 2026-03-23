class solution191 {
    public int hammingWeight(int n) {
        int c=0;int i=0;
        String s=Integer.toBinaryString(n);
        while(i<s.length()){
        if(s.charAt(i)=='1')
        {
            c++;
        }
        i++;
        }
        return c;
    }

    public static void main(String[] args) {
        solution191 sol = new solution191();
        int n = 11;
        System.out.println(sol.hammingWeight(n));
    }
}
