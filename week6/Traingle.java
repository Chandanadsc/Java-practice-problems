package week6;

public class Traingle extends GeometricShape{// don't worry wanted-ly changed the triangle spelling
public Traingle(int s1,int s2,int s3,String col)
{
	this.side1=s1;
	this.side2=s2;
	this.side3=s3;
	this.colour=col;
}
public Traingle()
{
	this.side1=1;
	this.side2=1;
	this.side3=1;
	this.colour=null;
}
public boolean isFilled()
{
	return (this.colour!=null);
}
public String toString()
{
	return "side1 "+this.side1+"\nside2 "+this.side2+"\nside3"+this.side3+"\n"+this.getArea()+"\n"+this.getPerimeter();
}
}
