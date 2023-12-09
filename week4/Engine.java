package week4;

public class Engine {
/*
 * Create a Class Engine with attributes engineID (int), engineType (String), horsepower(int), 
engineWeight (float). add constructors, getter, setters and toString () for Engine class.
 Create 2 objects in 
main () and access the methods using these objects. Display the details
 */
private	long engineID;
private	String engineType;
private int horsepowe;
private float engineWeight;

public float getEngineWeight() {
	return engineWeight;
}
public void setEngineWeight(float engineWeight) {
	this.engineWeight = engineWeight;
}
public int getHorsepowe() {
	return horsepowe;
}
public void setHorsepowe(int horsepowe) {
	this.horsepowe = horsepowe;
}
public String getEngineType() {
	return engineType;
}
public void setEngineType(String engineType) {
	this.engineType = engineType;
}
public long getEngineID() {
	return engineID;
}
public void setEngineID(long engineID) {
	this.engineID = engineID;
}
	
public Engine(long engineID,String engineType,int horsepowe,float engineWeight)
{
	this.engineWeight = engineWeight;
	this.horsepowe = horsepowe;
	this.engineType = engineType;
	this.engineID = engineID;
}
public Engine()
{
	
}
public String toString()
{
	return "id: "+this.engineID+"type: "+this.engineType+"horsepower: "+this.horsepowe+"engine wt is : "+this.engineWeight;
}
public void IDEngine()throws IdException,EngineTypeException,HorsepowExcep,EngWeightExcep
{
	if(Math.log(this.engineID)==8)
	{
		System.out.println("Enter engine type");
	}
	else 
	{
		throw new IdException();
	}
	if(this.horsepowe>2000)
	{
		throw new HorsepowExcep();
	}
	else 
	{
		System.out.println("Very Good");
	}
	if(this.engineType.length()==8)
	{
		System.out.println("Enter next data");
	}
	else 
	{
		throw new EngineTypeException();
	}
	if(this.engineWeight>500)
	{
		throw new EngWeightExcep();
	}
	else 
	{
		System.out.println("ffyftftf");
	}
}
 


}
