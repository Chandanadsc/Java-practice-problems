package kunal;
import java.util.*;
public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter a num");
int n=sc.nextInt();
int n1=0;
int n2=1;
int n3;
System.out.println(n1+"\n"+n2);
for(int i=2;i<=n;i++)
{
	n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
}

	}

}
