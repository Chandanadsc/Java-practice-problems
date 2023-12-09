package nnew;

public class DynamicStack implements Stack {
    private int d[];
    private int size;
    private int top;
    public DynamicStack(int n)
    {
    	this.size=n;
    	d=new int[n];
    	top=-1;
    }
	@Override
	public void push(int data) {
		if(top==size-1)
		{
			// create a new array
			int b[]=new int[2*size];
			for(int i=0;i<size;i++) {
				b[i]=d[i];
			}
			size=2*size;
			d=b;
			d[++top]=data;
		}
		
	}
	@Override
	public void display() {
		for(int i=top;i>=0;i--)
		{
			System.out.println(d[i]);
		}
		
	}
}
