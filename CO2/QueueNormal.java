package CO2;
import java.util.*;
import java.util.Queue;
public class QueueNormal   {
public static void main(String args[])
{
//	Scanner sc= new Scanner(System.in);
	Queue<Integer> q1 =new LinkedList<Integer>();
	q1.add(67);
	q1.add(69);
	q1.add(89);
	System.out.println(q1.contains(69));


	
	System.out.println(q1);
	// other ways of iterating
	for(int i=0;i<=q1.size();i++)
	{
		System.out.println(q1.poll());
	}
	System.out.println("head "+q1.peek());
}
}
