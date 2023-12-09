package co3;



import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
class ProducerTaruni extends Thread{
	BlockingQueue<Integer> bq;
	 public ProducerTaruni(BlockingQueue<Integer> bq){
		 this.bq=bq;
		 
	 }
	 public void run() {
		 
		 try {
			for(int i=0;i<12;i++)
			{
				bq.put(12);
				sleep(1000);
				System.out.println(12+"Produced");
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// WHy am I here ?
			/*
			 * The above  written codes are handling the critical section hence these may throw exception
			 */
			e.printStackTrace();
		}
	 }
}
class ConsumerTaruni extends Thread{
	BlockingQueue<Integer> bq;
	
	 public ConsumerTaruni(BlockingQueue<Integer> bq){
		 this.bq=bq;
		 
		 
	 }
	 public void run()
	 {
		 for(int i=0;i<10;i++)
			{
			 try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(bq.poll()+"Consumed");
				
			}
		 
	 }
}
public class BlockingQueueTaruni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> b1=new LinkedBlockingQueue<Integer>();
ProducerTaruni p1=new ProducerTaruni(b1);
ConsumerTaruni c1 = new ConsumerTaruni(b1);
p1.start();
c1.start();

	}

}
//TODO Auto-generated catch block
			// WHy am I here ?
			/*
			 * The above  written codes are handling the critical section hence these may throw exception
			 */