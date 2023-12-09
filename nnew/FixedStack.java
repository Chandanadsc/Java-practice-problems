package nnew;

public  class FixedStack implements Stack{
private int a[];
private int n;
private int top;
public FixedStack(int n)
{
	this.n=n;
	a=new int[n];
	top=-1;
}
public void push(int d)
{
	if(top==n-1)
	{
		System.out.println("Stack is full");
	}
	else 
	{
		a[++top]=d;
	}

}
@Override
public void display() {
	// TODO Auto-generated method stub
	for(int i=top;i>=0;i--)
	{
		System.out.println(a[i]+" ");
	}
}
}
