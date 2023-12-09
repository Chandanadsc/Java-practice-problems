package oops_byKK;

public class Box {
     double l;
      double h;
     double w;
     double weight;
     
     Box(){
    	 this.h=-1;
    	 this.l=-1;
    	 this.w=-1;
     }
     Box(double side){
    	 this.h=side;
    	 this.l=side;
    	 this.w=side;
     }
     
     Box(double l,double h,double w){
    	 super();
    	 this.l=l;
    	 this.w=w;
    	 this.h=h;
     }
     Box(Box old){
    	this.l=old.l;
    	this.h=old.h;
    	this.w=old.w;
     }
     public void displayInfo() {
    	 System.out.println("Running the box");
     }
}
