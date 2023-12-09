package practiceforExam;

public abstract class Shape {
	int numSides;
	public Shape(int numSides)
	{
		this.numSides=numSides;
	}
	public int getnumSides()
	{
		return this.numSides;
	}
	public abstract void getArea();
	public abstract void getPerimeter();
	
/*
 * ) Write an abstract class Shape with the following. • Data members: numSides • Constructor: initialize 
 * numSides • Concrete method: get method for numSides • Abstract methods: getArea(), getPerimeter() Write a
 * concrete subclass Rectangle with the following. • Data members: width, height Write a concrete subclass 
 * RtTriangle with the following. • Data members: width, height*/
	
}
