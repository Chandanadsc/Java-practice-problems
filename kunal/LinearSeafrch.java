package kunal;
import java.util.*;
public class LinearSeafrch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
//size of the array
System.out.println("enter size of array");
n=sc.nextInt();
int[] a=new int [n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("enter the target array");
int target=sc.nextInt();
 System.out.println(NormalFinding( a,n, target));
	}
	static int NormalFinding(int[] a,int n,int target)
	{
		for(int j=0;j<n;j++)
		  {
			  if(a[j]==target)
			  {
				 System.out.println("Element found at"+j);
				return j;
			  }
		  }
		return -1;
	}

}
