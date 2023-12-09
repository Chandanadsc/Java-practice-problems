package kunalOOPs;

public class SwapInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;//pass by reference is not possible in java
int b=20;
Integer a1=10;// the wrapper class Integer is a  final class 
Integer b1=20;
swap(a,b);
System.out.println(a+" "+b);
swap(a1,b1);
System.out.println(a1+" "+b1);
	}
static void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
static void swap(Integer a,Integer b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	
}

}
