package stringsConcept;
class Testimmutablestring{  
	 public static void main(String args[]){  
	   String s="Sachin";  
	   s.concat(" Tendulkar");
	   //concat() method appends the string at the end
	   s=s+"hello";
	   System.out.println(s);//will print Sachin because strings are immutable objects  
	 }  
	}  

