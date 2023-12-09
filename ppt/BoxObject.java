package ppt;

 class BoxObject {
int length;
int breadth;
int height;
public void setBox()
{
	this.length=12;
	this.breadth=13;
	this.height=14;
}
public void BoxVolume()
{
	double vol=this.length*this.breadth*this.height;
	System.out.println(vol);
}
}

