package co3;

public class UsingJoin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jobs1 t1=new Jobs1();
		 t1.start();
		 Thread t2= new Jobs2();
		 try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 t2.start();
		
			 try {
				 t1.sleep(600);
				
				
				 
				t2.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 
		 System.out.println("Completed");
		
	}

}
class Jobs1 extends Thread{
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
class Jobs2 extends Thread{
	private int limit=10;
	public void run()
	{
		for(int i=1;i<=limit;i++)
		{
			
			System.out.println("5 *"+" "+i+" = "+5*i);
		}
	}
}




