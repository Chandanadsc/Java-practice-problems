package week4;

public class Area {
int length;
int breadth;
public Area(int l,int b)
{
	this.length=l;
	this.breadth=b;

}
    public Area(int l)
    {
    	this.length=l;
    	this.breadth=l;
    }
    public Area()
    {
    	this.length=0;
    	this.breadth=0;
    }
    void PrintArea()
    {
    	System.out.println("Area is "+this.breadth*this.length);
    }
}
