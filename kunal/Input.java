package kunal;
import java.util.*;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter 30 to stop input ");
		long sum=0;
		do {
			n=sc.nextInt();
			sum+=n;
		}while(n!=30);
		System.out.println("sum is "+sum);
	}

}
