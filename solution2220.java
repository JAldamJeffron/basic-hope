class solution2220 {
    public int minBitFlips(int start, int goal) {
        int c=0;
        while(start>0 && goal>0){
            int n=start%2;
            int m=goal%2;
            if(n!=m)c++;
            start/=2;
            goal/=2;
        }
        while(start>0){
            int n=start%2;
            if(n!=0) c++;
            start/=2;
        }
        while(goal>0){
            int m=goal%2;
            if(m!=0) c++;
            goal/=2;
        }
        return c;
    }

    public static void main(String[] args) {
        solution2220 sol = new solution2220();
        int start = 8;
        int goal = 7;
        System.out.println(sol.minBitFlips(start, goal));
    }
}
