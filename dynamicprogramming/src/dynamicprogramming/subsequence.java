package dynamicprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequence {
 //longest increasing subsequence
	//length of LIS of { 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 and LIS is {10, 22, 33, 50, 60, 80}.
	public static void main(String[] args)
	{
		int[] arr=new int[6];
		Scanner n=new Scanner(System.in);
		for(int i=0;i<6;i++)
			arr[i]=n.nextInt();
		int[] solutions = new int[6];
		
		for(int i=1;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{		if(arr[i]>arr[j] && solutions[i]<solutions[j]+1)
					solutions[i]=solutions[j]+1;
			}
		
		}
	    
		int max=0;
		
		for(int i=0;i<6;i++)
		{
			if(max<solutions[i])
				max=solutions[i];
				
		}
		
		System.out.println(max);
		
	}
}