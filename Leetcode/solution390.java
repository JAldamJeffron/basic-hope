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
}
