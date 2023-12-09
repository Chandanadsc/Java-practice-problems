package practiceforExam;

public class Rectangle extends Shape{
	
public Rectangle(int numSides) {
		super(numSides);
		// TODO Auto-generated constructor stub
	}

	//concrete subclass Rectangle with the following. • Data members: width, height
	int width;
	int height;
	@Override
	public void getArea() {
		System.out.println("Area is "+this.width*this.height);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter "+2*(this.height+this.width));
		// TODO Auto-generated method stub
		
	}
	
}
