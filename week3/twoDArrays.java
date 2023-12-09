package week3;
import java.util.*;

public class twoDArrays {
	
public static void main(String[]args)
{
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[][]=new int [m][n];
	int i,j;
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
			
		}

	}
FindSum(a, m, n);
PrintData(a, m, n);
SumOfPrinciDiag(a, m, n);
PrinciPrint(a,m,n);
}

static void FindSum(int a[][],int m,int n)
{long s=0;
int i,j;
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			
			s=s+a[i][j];
		}
	}
	System.out.println("the sum of elements in the given 2d array is "+s);
}
static void PrintData(int a[][],int m,int n)
{
	int i,j;
	System.out.println("the given 2d array");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
static void SumOfPrinciDiag(int a[][],int m,int n)
{
	int i,j;
	int p = 0;
	if(m==n)
	{
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					p=p+a[i][j];
				}
				
			}
		}
	}
	System.out.println("sum of principal digonal elements is "+p);
}
static void PrinciPrint(int a[][],int m,int n)
{
	int i,j;
	if(m==n)
	{
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]+" ");
				}
				
			}
		}
	}
}
}


