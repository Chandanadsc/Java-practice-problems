package kunal;
import java.util.*;
public class Codechef {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t;
	    t=sc.nextInt();
	    while(t-->0)
	    {
	        int n;
	        n=sc.nextInt();
	        int[] a=new int[n];
	        int i;
	        for(i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int min=getMin(a,n);
	        int x=findDupicateInArray(a,min);
	        int out=n-x-1;
	        System.out.println(out);
	    }
		// your code goes here
	}
	static int getMin(int a[],int n)
	{
	    int min=a[0];
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]<min)
	        {
	            min=a[i];
	        }
	    }
	    return min;
	}
	public static int findDupicateInArray(int[] a,int min) {
        //int pointer = a[0];
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k] && j!=k && j<k && count<=1&&a[j]==min) {
                    count++;
                    
                 

                }

            }


        }
        return count;
	}
}

