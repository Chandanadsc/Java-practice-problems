package nnew;

import java.util.Scanner;

public class ShapeDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Shape p1;
    int n;
    System.out.println("+1 to rectangle 2 for circle");
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
    if(n==1)
    {
      p1=new Rectangle(5,6);
    }
    else
    {
      p1=new Circle(4);
    }
        System.out.println("p1"+p1);
        if(p1.area())
        {
          
        }
        else if(p1.perimeter())
        {
          
        }
  }

}
//demo