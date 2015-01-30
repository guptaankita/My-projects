package dynamicprogramming;

import java.util.*;

public class subsequencepair1 {
 //program to implement longest increasing subsequence of pairs
	//array: 13 14 10 11 12
	//longest : 10 11 12
	public static void main(String[] args)
	{
		int[] arr=new int[6];
		Scanner n=new Scanner(System.in);
		for(int i=0;i<6;i++)
			arr[i]=n.nextInt();
		ArrayList<Integer>[] solutions = new ArrayList[6];
		ArrayList<Integer> best=null;
		givesequence(arr,solutions,0);
		for(int i=0;i<6;i++)
			best=checkgreater(best,solutions[i]);
		
		for(int i=0;i<best.size();i++)
			System.out.println(best.get(i));
		
		}
	
	public static void givesequence(int[] arr, ArrayList<Integer>[] solutions, int current_index)
	{
		if(current_index>=arr.length||current_index<0)
			 return;
		int cur= arr[current_index];
		ArrayList<Integer> best=null;
		for(int i=0;i<current_index;i++)
		{
			if(arr[i]<arr[current_index])
				best=checkgreater(best,solutions[i]);
		}
		
		ArrayList<Integer> new_solution= new ArrayList<Integer>();
		if(best!=null)
		{
			new_solution.addAll(best);
		}
		new_solution.add(cur);
		solutions[current_index]= new_solution;
		givesequence(arr,solutions,current_index+1);
		
	}
	
	static ArrayList<Integer> checkgreater(ArrayList<Integer> s1, ArrayList<Integer> s2)
	{
		if(s1==null) return s2;
		if(s2==null) return s1;
		return s1.size()>s2.size()?s1:s2;
	}
}
