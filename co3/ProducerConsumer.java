package co3;
class Info{
	private int info;
	
	public void setInfo(int info) {
		this.info=info;
	}
	public int getInfo()
	{
		return this.info;
	}
}
class Producer extends Thread{
	private Info info;
	public Producer(Info info)
	{
		this.info=info;
	}
	public void run() {
		for(int i=0;i<50;i++)
		{
			
			info.setInfo(i);
			
	System.out.println("Produced Data is :"+i);
	try {
		sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
class Consumer extends Thread{
	private Info info;
	public Consumer(Info info)
	{
		this.info=info;
	}
	public void run() {
		for(int i=0;i<50;i++)
		{
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("Consumed Data is :"+info.getInfo());
	}
}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Info i=new Info();

Producer p1=new Producer(i);
Consumer c1= new Consumer(i);
p1.start();
c1.start();
	}
}


