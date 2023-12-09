package ppt;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int  i,c=0,r=0,s=0;
for(i=n;i>0;i=i/10)
{
	c++;
}
for(i=n;i>0;i++)
{
	r=i%10;
	s=(int) (s+Math.pow(r,c));
}
if(s==n)
{
	System.out.println("YEs");
}
else 
{
	System.out.println("No");
}
	}

}
