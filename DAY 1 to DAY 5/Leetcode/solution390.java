class solution390 {
    public int lastRemaining(int n) {
        boolean left=true;
        int r=n;
        int head=1;
        int step=1;
        while(r>1){
            if(left || r%2 == 1){
                head=head+step;
            }
            r=r/2;
            step=step*2;
            left=!left;
        }
        return head;
    }
    
    public static void main(String[] args) {
        solution390 sol = new solution390();
        System.out.println("n=9: " + sol.lastRemaining(9));
        System.out.println("n=1: " + sol.lastRemaining(1));
        System.out.println("n=2: " + sol.lastRemaining(2));
        System.out.println("n=10: " + sol.lastRemaining(10));
    }
}
