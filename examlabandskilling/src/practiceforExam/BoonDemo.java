package practiceforExam;

public class BoonDemo {
	public static void main(String[] args) {
	    Book book1 = new Book();
	    try {
	        book1.setBName("The Catcher in the Rye");
	        book1.setBId("123456");
	        book1.setBAuthor("J.D. Salinger");
	        book1.setYOP(1951);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    System.out.println(book1);

	    Book book2 = new Book();
	    try {
	        book2.setBName("The Great Gatsby");
	        book2.setBId("789012");
	        book2.setBAuthor("F. Scott Fitzgerald");
	        book2.setYOP(1925);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    System.out.println(book2);
	}
}
