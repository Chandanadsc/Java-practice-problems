package nnew;

import java.util.Scanner;

public class EmployeDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
   int n;
   Employe p1;
    System.out.println("Enter 1:FULL TIME\n2:PART TIME");
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
    if(n==1)
    {
      p1=new FullTime(214,"Chandana",60000,400,5000);
    }
    else
    {
      p1=new PartTime(214,"Chandana",1100,50);
    }
        System.out.println(p1);
  }

}
//demo