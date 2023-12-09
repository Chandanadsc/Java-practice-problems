package nnew;

abstract public class Shape {
 protected int l;
 public Shape(int l)
 {
   this.l=l;
 }
 String tostring()
 {
   return "l is"+this.l;
 }
 abstract public boolean area();
 abstract public boolean perimeter();
public boolean Area() {
	// TODO Auto-generated method stub
	return false;
}
public boolean Perimeter() {
	// TODO Auto-generated method stub
	return false;
}
}
//shape