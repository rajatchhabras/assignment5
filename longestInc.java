package assignment5;

import java.util.Scanner;
class greatest
{
	
	private int size;
	private int arr[];
	public greatest()
	{
		
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		 arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
	}
	void great()
	{
		
		int max=0,max_c=0,count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				++count;
				max=arr[i];
			}
			else
			{
				count=1;
			max=0;
			}
			if(max_c<count)
				max_c=count;
			
		}
		System.out.println(max_c);
	}
}
public class longestInc {

	
	
	public static void main(String[] args) {
	greatest p=new greatest();
	p.great();
	}

}
