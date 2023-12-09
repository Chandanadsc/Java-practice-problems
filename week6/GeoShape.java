package week6;

public class GeoShape {
/*
 * Create GeometricShape Class with attributes borderColor (String), filled (Boolean type) with three setter, 
getters and toString (). This is inherited by Rectangle Class with length and width as attributes. The 
Rectangle class is further inherited by Cuboid class with height field as its instance variable. Add mutators, 
accessors and toString () methods. Use super keyword. (Multilevel Inheritance)

 */
  private String borderColor;
  private boolean filled;
public String getBorderColor() {
	return borderColor;
}
public void setBorderColor(String borderColor) {
	this.borderColor = borderColor;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public String toString()
{
	return "filled "+this.isFilled()+"border colour "+this.borderColor;
}
  
}
