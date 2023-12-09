package week4;

public class Cuboid {
/*
 * Create a Cuboid class with 3 instance variables length, breadth and height of type double, and a method 
volume (). Add steers getters and toSting() and create 2 objects with different values and print the volume.
In main()
 */
	private int length;
	private int breadth;
	private int height;
	public int getLenght() {
		return length;
	}
	public void setLenght(int lenght) {
		this.length = lenght;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void Volume()
	{
		System.out.println("volume is "+this.breadth*this.height*this.length);
	}
	public String toString()
	{
		return "l: "+this.length+"b: "+this.breadth+"h: "+this.height;
	}

}
