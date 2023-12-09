package examlabandskilling;

public class Item {
 String name;
 String id;
 double cost;
 public Item(String Name,String id,double cost)
 {
	 this.name=Name;
	 this.id=id;
	 this.cost=cost;
 }
 public Item()
 {
	 
 }
 public String toString()
 {
	 return this.name+" "+this.id+" "+this.cost;
 }
}
