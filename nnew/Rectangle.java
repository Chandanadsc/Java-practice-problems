package nnew;

public class Rectangle extends Shape{
 private int l2;
 public Rectangle(int l,int l2)
 {
   super(l);
   this.l2=l2;
 }
 public boolean area()
 {
  int a =l*l2;
  System.out.println(a);
  return true;
 }
@Override
public boolean perimeter() {
  int b=2*(l+l2);
  System.out.println(b);
  return true;
}
}
//rectangle