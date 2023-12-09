package co3;

public class Threadexp1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t2= new Task2();
		System.out.println(t2);
		t2.start();
		try {
			t2.sleep(1);
		} catch (InterruptedException e) {
			
			System.out.print("Interrupt ");
			e.printStackTrace();
		}
		Thread t1= new Task1();
	    System.out.println(t1);
		t1.start();
		

	
	}
}

class Task1 extends Thread{
	
	private int limit=5;
	public void run()
	{
		for(int i=0;i<limit;i++)
		{
			for(int j=0;j<=i;j++)
			{
					System.out.print("*");
		
			}
			System.out.println();
		}
	}
}
class Task2 extends Thread{
	public void run() {
		
			for(int j=1;j<=10;j++)
			{
					System.out.println(5*j);
		
			}
		
	}
		

	
	}
	


// start method internally calls the run method
