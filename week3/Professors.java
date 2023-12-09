package week3;
import java.util.*;
public class Professors {
public static void main(String[]args)
{
	int s=0;
	Scanner sc=new Scanner(System.in);
	int[] a= {9, 12, 14, 16, 21};
	int i;

	for(i=0;i<a.length;i++)
	{
		s=s+a[i];
	}
	System.out.println("the total number of professors "+s);
}

}
