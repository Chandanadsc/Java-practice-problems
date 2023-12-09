package practiceforExam;
import java.util.*;
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numsides = 0;
		numsides=sc.nextInt();
		System.out.println("ENter num of sides");
		if(numsides==4)
		{
			System.out.println("Enter width and height");
			
  Rectangle r1=new Rectangle(4);
  r1.height=sc.nextInt();
  r1.width=sc.nextInt();
  r1.getArea();
  r1.getPerimeter();
		}
		else if(numsides==3)
		{
			RtTriangle t1=new RtTriangle(3);
			System.out.println("Enter width and height");
			
			
			  t1.height=sc.nextInt();
			  t1.width=sc.nextInt();
			  t1.getArea();
			  t1.getPerimeter();
		}
  
	}

}
