class solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                s+=accounts[i][j];
            }
            if(s>max) max=s;
        }
        return max;
    }

    public static void main(String[] args) {
        solution1672 sol = new solution1672();
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(sol.maximumWealth(accounts));
    }
}