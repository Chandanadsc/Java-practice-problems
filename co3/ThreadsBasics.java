package co3;

public class ThreadsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new Thread();
//Thread t2=new Thread();
//Thread t3=new Thread();
//Thread t4=new Thread();
Thread t2= new Employee("Employee1");
Thread t3 = new Manager();
t1.start();
t2.start();
t3.start();
//t4.start();

System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
System.out.println(t3.isAlive());

//t4.isAlive(); 
System.out.println(Thread.activeCount());
	}

}
class Employee extends Thread{
	public Employee(String tName)
	{
		super(tName);
	}
	@Override
	public void run() {
		System.out.println("This is a hello from employee"+Thread.currentThread().getId()+">>"+Thread.currentThread().getName());
	}
}
class Manager extends Thread{
	@Override
	public void run() {
		System.out.println("This is a hello from Manager"+Thread.currentThread().getId()+">>"+Thread.currentThread().getName());
	} 
}
