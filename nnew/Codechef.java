package nnew;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef {
	/* package codechef; // don't place package name! */

	
	/* Name of the class has to be "Main" only if the class is public. */
	
		public static void main (String[] args) throws java.lang.Exception
		{
		    int t;
		    Scanner sc=new Scanner(System.in);
		    t=sc.nextInt();
		    for(int i=0;i<t;i++)
		    {
		        String n;
		        n=sc.next();
		        int k=20;
		        int ans=0,j;
		        for( j=0;j<n.length();j++)
		        {
		            ans=((ans*10)+(n.charAt(j)-'0'))%k;
		        }
		        System.out.println(ans);
		    }
			// your code goes here
		}
}
