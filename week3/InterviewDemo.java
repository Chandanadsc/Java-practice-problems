package week3;
import java.util.*;
public class InterviewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
Interview i1=new Interview();
System.out.println("enter the refference id to search");
int ref=sc.nextInt();
boolean x=i1.Search(n, a,ref);
System.out.println("The given ID exist"+x);
	}

}
