package week4;

public class BookDemo {

	public static void main(String[] args) {
	
		 
		// TODO Auto-generated method stub
Book b1=new Book();
b1.setBauthor("Sai Sree");
b1.setBId(45);
b1.setBName("my BOOK");
b1.setYOP(2005);
String au=b1.getBauthor();
   long id=b1.getBId();
 String name=b1.getBName();
int yop=b1.getYOP();
  System.out.println("author :"+au+"\nid :"+id+"name "+name+"yop:"+yop);
	}

}
