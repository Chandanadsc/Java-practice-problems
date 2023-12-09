package ppt;
import java.util.*;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Take integer inputs till the user enters 0 and print the largest number from all.
		Scanner sc=new Scanner(System.in);
		int n=-1;
		int max=0;
		while(n!=0)
		{
			n=sc.nextInt();
			if(n>max)
			{
				max=n;
			}
		}
		System.out.println("Max is "+max);
	}

}
