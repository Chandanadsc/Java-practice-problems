package oops_byKK;

public class BoxPrice extends BoxWeight {
       double cost;
       BoxPrice(){
    	   super();
    	   this.cost=-1;
    	   
       }
       BoxPrice(BoxPrice other){
    	   super(other);
    	   this.cost =other.cost;
       }
}
