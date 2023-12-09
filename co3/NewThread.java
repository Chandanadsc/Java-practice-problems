package co3;

public class NewThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread main =Thread.currentThread();
		System.out.println(main);// creating new thread with name main
		main.setName("Super");
		main.setPriority(7);
		int x=main.MAX_PRIORITY;
		System.out.println(main);
		Thread t1= new Thread();
		System.out.println(t1);
		t1.setName("Sub--t1");
		System.out.println(t1);
//		t1.getName();
		System.out.println(t1.getName());
	}

}
