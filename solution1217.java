class solution1217 {
    public int minCostToMoveChips(int[] position) {
        int o=0,e=0;
        for(int i=0;i<position.length;i++)
        {
            if(position[i]%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        if(e<o){
            return e;
        }
        else{
            return o;
        }
    }

    public static void main(String[] args) {
        solution1217 sol = new solution1217();
        int[] position = {1,2,3};
        System.out.println(sol.minCostToMoveChips(position));
    }
}
