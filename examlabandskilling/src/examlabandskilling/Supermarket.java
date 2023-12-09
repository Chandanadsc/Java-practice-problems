package examlabandskilling;
import java.util.*;

public class Supermarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
Scanner sc=new Scanner(System.in);
LinkedList<Item> l1=new LinkedList<Item>();
do
{
	System.out.println("Enter the details of item: Name ,Id,Cost");
	Item i1=new Item();
	i1.name=sc.next();
	i1.id=sc.next();
	i1.cost=sc.nextDouble();
	l1.add(i1);
	System.out.println("Enter 1 to continue");
	 x=sc.nextInt();
}
while(x==1);
l1.sort(Comparator.comparing(Item->Item.cost));
System.out.println(l1);
	}
	

}
