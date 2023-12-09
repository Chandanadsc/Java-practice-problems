package week9;

public class Engine {
/*
 * Create a Class Engine with attributes engineID (int), engineType (String), horsepower(int), engineWeight
(float). add constructors, getter, setters and toString () for Engine class. Enhance the setters in such a way 
that if invalid data is sent the setter will generate an appropriate exception. Create 2 objects in main () and 
access the methods using these objects. Display the details.
 */
private int engineID;
private	String engineType;
private	int horsepower;
private	float engineWeight;
public int getEngineID() {
	return engineID;
}
public void setEngineID(int engineID) {
	if(engineID<=0)
	{
		throw new IllegalArgumentException("Cannot be negative");
	}
	this.engineID = engineID;
}
public String getEngineType() {
	return engineType;
}
public void setEngineType(String engineType) {
	if(engineType.equals(null))
	{
		throw new IllegalArgumentException("Cannot be null");
	}
	this.engineType = engineType;
}
public int getHorsepower() {
	return horsepower;
}
public void setHorsepower(int horsepower) {
	if(horsepower<200){
		throw new IllegalArgumentException("Cannot be less than 200");
	}
	this.horsepower = horsepower;
}
public float getEngineWeight() {
	return engineWeight;
}
public void setEngineWeight(float engineWeight) {
	this.engineWeight = engineWeight;
}
	
}
