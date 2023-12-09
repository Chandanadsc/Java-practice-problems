package oops_byKK;

public class BoxWeight extends Box {
 double weight;
 BoxWeight(BoxPrice other){
	 this.weight=-1;
 }
     BoxWeight(double l, double h, double w, double weight){
    	 super(l,h,w);// call the parent class constructor
    	 this.weight=weight; 
     }
	public BoxWeight() {
		// TODO Auto-generated constructor stub
	}
     
}
