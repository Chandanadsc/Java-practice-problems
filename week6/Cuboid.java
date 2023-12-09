package week6;

public class Cuboid extends Rectangle{
//Cuboid class with height field as its instance variable. Add mutators, 
	//accessors and toString () methods. Use super keyword. (Multilevel Inheritance)
	private int height;
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public long Volume()
	{
		return this.height*this.length*this.width;
	}
	public String toString()
	{
		return super.toString()+"\nheight"+this.height;
	}
}
