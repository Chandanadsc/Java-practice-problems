package ppt;

import java.util.Scanner;

public class MaxMin {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter p,q,r");
			int p=sc.nextInt();
			int q=sc.nextInt();
			int r=sc.nextInt();

	int min=Min(p,q,r);
	int max=Max(p,q,r);
	}
static int Max(int p,int q,int r)
{
	if(p>q&&p>r)
	{
		return p;
	}
	else if(q>r)
	{
		return q;
	}
	
		return r;
		
}
static int Min(int p,int q,int r)
{
	if(p<q&&p<r) 
			
		
	{
		return p;
	}
	else if(q<r)
	{
		return q;
	}
	
		return r;
		
}


}