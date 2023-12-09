package week3;

public class Interview {
boolean Search(int n,int a[],int ref)
{
	for(int i=0;i<n;i++)
	{
		if(a[i]==ref)
		{
			return true;
		}
	}
	
			return false;
}
}
