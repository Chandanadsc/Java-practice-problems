package week6;

public class Rectangle extends GeoShape {
//This is inherited by Rectangle Class with length and width as attributes.
	protected int length;
protected int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String toString()
	{
		return super.toString()+"\nlength "+this.length+"\nwidth"+this.width;
	}
}
