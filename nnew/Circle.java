package nnew;

public abstract class Circle extends Shape {
public Circle(int l)
{
  super(l);
}
  @Override
  public boolean Area() {
    double a =3.14*l*l;
    System.out.println(a);
    return true;
  }

  @Override
  public boolean Perimeter() {
    double b=2*3.14*l;
    System.out.println(b);
    return true;
  }
 
}
//circle