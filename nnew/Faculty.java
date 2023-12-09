package nnew;

public class Faculty extends Person {
	String qualification;
	double feed;
 public Faculty(String name,int age,String qualification,double feed)
 { super(name,age);
	 this.qualification=qualification;
	 this.feed=feed;
	 
 }

 public String toString()
 {
	 return this.toString()+"\n Qualification is "+this.qualification+"\nfeed back "+this.feed;
 }
 public boolean isOutstanding()
 {
	 return (this.feed>90.0);
 }

}
