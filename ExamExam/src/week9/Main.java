package week9;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int id,quantity;
String name;
double price;
id=sc.nextInt();
name=sc.next();
quantity=sc.nextInt();
price=sc.nextDouble();
Product p1=new Product ();
p1.setId(id);
p1.setName(name);
p1.setPrice(price);
p1.setQuantity(quantity);
System.out.println(p1);
	}

}
