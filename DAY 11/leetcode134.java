
public class leetcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0,totcost=0,total=0,n=gas.length,index=0;
        for(int i=0;i<n;i++)
        {
            totgas+=gas[i];
            totcost+=cost[i];
            total+=gas[i]-cost[i];
            if(total<0)
            {
                index=i+1;
                total=0;
            }
        }
        return (totgas<totcost)?-1:index;
    }
}