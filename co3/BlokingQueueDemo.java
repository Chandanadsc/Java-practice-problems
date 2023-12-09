package co3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
class ProducerinBQ implements Runnable{
	BlockingQueue<Integer> bq;
	 public ProducerinBQ(BlockingQueue<Integer> bq){
		 this.bq=bq;
		 
	 }
	 public void run() {
		 
		 try {
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);	
				bq.put(i);
				
				System.out.println(i+"Produced");
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
}
class ConsumerinBQ implements Runnable{
	BlockingQueue<Integer> bq;
	
	 public ConsumerinBQ(BlockingQueue<Integer> bq){
		 this.bq=bq;
		 
		 
	 }
	 public void run()
	 {
		 for(int i=0;i<10;i++)
			{
			 try {
				 Thread.sleep(1000);	
						} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(bq.poll()+"Consumed");
				
			}
		 
	 }
}
public class BlokingQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> b1=new LinkedBlockingQueue<Integer>();
Runnable p1=new ProducerinBQ(b1);
Runnable c1 = new ConsumerinBQ(b1);
p1.run();
c1.run();

	}

}
