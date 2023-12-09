package examlabandskilling;
import java.util.*;
public class lab_1st {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter units of current");
int n=sc.nextInt();
double bill;
if(n>=51&&n<=100)
{
	bill=n*3;}
else if(n<=300)
{
	bill=n*5+100;
}
else if(n<=450)
{
	bill=n*6+200;
}
else if(n>450)
{
	bill=n*8+250;
}
else 
{
	bill=0;
}
System.out.println("bill is"+bill);
}
}
