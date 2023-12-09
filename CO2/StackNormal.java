package CO2;
import java.util.*;
public class StackNormal {
	 static int[] stack =new int[10];
	 static int top=-1;
public static void main(String args[])
{ 
	Scanner sc=new Scanner(System.in);
	
	
    	System.out.println("Enter a number to push into the stack");
    	push(1);
    	push(2);
    	push(3);
    	int x=pop();
    	for(int i=0;i<10;i++)
    	{
    		System.out.println(stack[i]);
    	}
    
    	
  
}
static void push(int x) {
	if(top!=9)
	{
		top=top+1;
		stack[top]=x;
	}

}
static int pop()
{
	if(top!=-1)
	{
		return stack[top];
	}
	return Integer.MAX_VALUE;
}
}
