package week4;
import java.util.*;
public class EngineDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);





Engine e1=new Engine(23456,"durable",3000,590);
try
{
	e1.IDEngine();
}
catch(IdException x)
{
System.out.println(x);

}


catch (EngineTypeException y)
{
	System.out.println(y);
}
catch ( EngWeightExcep c)
{
	System.out.println(c);
}
catch ( HorsepowExcep
		p)
{
	System.out.println(p);
}




//int engineID,String engineType,int horsepowe,float engineWeight
	}

}
