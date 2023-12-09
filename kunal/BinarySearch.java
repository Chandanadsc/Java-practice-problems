package kunal;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the size of the array");
n=sc.nextInt();
int i;
int[] arr=new int[n];
System.out.println("Enter the data onto array in sorted order");
for(i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int target ;
System.out.println("Enter the target");
target=sc.nextInt();
int index=binarySearch(arr,target);
System.out.println("index "+index);


	}
	 static int binarySearch(int a[],int target)
	{
		  
			int start=0;
			int end=a.length-1;
			int mid;
			
			  while(start<=end)
			  {
				  mid=(start+end)/2;
				  if(a[mid]==target)
				  {
					  return mid;
				  }
				  else if(target>a[mid])
				  {
					  start=mid+1;
				  }
				  else 
				  {
					  end =mid-1;
				  }
			  }
			  return -1;
	}

}
