package nnew;

public  class StackDemo {

	public static void main(String[] args) {
	FixedStack f1=new FixedStack(3);
	DynamicStack d1=new DynamicStack(3);
	System.out.println("pushing data into fixed stack");
	
	for(int i=1;i<=10;i++)
	{
		f1.push(i*10);
	}
	System.out.println("pushing data into Dynamic stack");
	for(int i=1;i<=10;i++)
	{
		d1.push(i*5);
	}
	System.out.println("Data from fixed stack is ");
	f1.display();
	System.out.println("Data from Dynamic stack is ");
	d1.display();
	}

}
