package co3;

public class usingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Task1 t1=new Task1();
 t1.start();
 Task2 t2= new Task2();
 t2.start();
	}
	

}
class Task1 extends Thread{
	private int limit;
	public void run()
	{
		for(int i=0;i<=limit;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
class Task2 extends Thread{
	private int limit=10;
	public void run()
	{
		for(int i=1;i<=limit;i++)
		{
			
			System.out.println("5 *"+" "+i+" = "+5*i);
		}
	}
}
