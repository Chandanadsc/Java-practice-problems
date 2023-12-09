package Patterns;
import java.util.*;
public class PascalTringleInDiff_way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Triangle(n);
	}

	public static void Triangle(int n)
	{
	    for(int i=1; i<=n; i++)
	    {
	        int c=1;
	        for(int k=n; k>i; k--)
	        {
	            System.out.print("  ");
	        }
	        for(int j=1; j<=i; j++) // Change i++ to j++
	        {
	            System.out.print(" "+c+"  ");
	            c=c*(i-j)/j;
	        }
	        System.out.println();
	    }
	}


}
