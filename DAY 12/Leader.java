import java.util.*;
public class Leader {
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=s.nextInt();
		}
		int index=n-2,c=1,max=nums[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(max<nums[i])
			{
				max=nums[i];
				c++;
				nums[index--]=max;
			}
		}
		index=0;
		int[] arr=new int[c];
		for(int i=n-c;i<n;i++)
		{
			arr[index++]=nums[i];
		}
		for(int i=0;i<c;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}