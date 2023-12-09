package kunal;
import java.util.*;
public class  PalindromeKunal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter a num");
int n=sc.nextInt();
int rev=0;
for(int i=n;i>0;i/=10)
{
	rev=rev*10+i%10;
}
if(rev==n)
{
	System.out.println("YES");
}
else
{
	System.out.println("NO");
}
	}
}

//PalindromeKunal