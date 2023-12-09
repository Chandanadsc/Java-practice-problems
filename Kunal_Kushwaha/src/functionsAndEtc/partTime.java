package functionsAndEtc;
public class partTime {
private int perhr, hrs;

partTime(int perhr,int hrs)
{
	this.perhr =perhr;
	this.hrs=hrs;
}
public void Calculate()
{
	
	System.out.println(perhr*hrs);
}
}
