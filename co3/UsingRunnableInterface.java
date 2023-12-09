package co3;

public class UsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Runnable r1 = new Runnable() {
//	public void run() {
//		System.out.println("Hello "+Thread.currentThread().getName());
//	}
//};
		Runnable r1= ()-> System.out.println("Hello "+Thread.currentThread().getName());
Runnable r2= new Runnable() {
	public void run() {
		System.out.println("Hi "+Thread.currentThread().getName());
	}
};
	
	
Thread t1 =new Thread(r1,"T1");
Thread t2= new Thread(r2,"T2");
t1.start();
t2.start();
Managers m1 =new Managers();
Thread t3 =new Thread(m1);
t3.start();
System.out.println(Thread.activeCount());
	}

}
class Employees implements Runnable{
	
	@Override
	public void run() {
		System.out.println("This is a hello from employee"+Thread.currentThread().getId()+">>"+Thread.currentThread().getName());
	}
}
class Managers implements Runnable{
	@Override
	public void run() {
		System.out.println("This is a hello from Manager"+Thread.currentThread().getId()+">>"+Thread.currentThread().getName());
	} 
}

