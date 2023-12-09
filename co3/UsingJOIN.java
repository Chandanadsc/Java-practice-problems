package co3;

public class UsingJOIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job1 t1=new Job1();
		 t1.start();
		 Thread t2= new Job2();
		
		 try {
				
				t1.join();
				t1.sleep(600);	
				t2.start();
				t2.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		// t1.isAlive(); -- returns a boolean string telling the state of the Thread(alive or terminated)
		
		 System.out.println("Completed");
		
	}

}
class Job1 extends Thread{
	private int limit=5;
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
class Job2 extends Thread{
	private int limit=10;
	public void run()
	{
		for(int i=1;i<=limit;i++)
		{
			
			System.out.println("5 *"+" "+i+" = "+5*i);
		}
	}
}

