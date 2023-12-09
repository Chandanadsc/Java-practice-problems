package stringsConcept;

public class StringBufferExample {
	public static void main(String args[]){  
		StringBuffer s=new StringBuffer("Hello");
		//The append() method concatenates the given argument with this String
	s.append(" java");
	System.out.println(s);
	//The insert() method inserts the given String with this string at the given position.
	s.insert(11, "karma");
	System.out.println(s);
	//The replace() method replaces the given String from the specified beginIndex and endIndex.
	s.replace(0, 5, "learning ");
	System.out.println(s);
	//The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.
	s.delete(6, 9);
	System.out.println(s);
	//The reverse() method of the StringBuilder class reverses the current String.
	s.reverse();
	System.out.println(s);
	/*
	 * The capacity() method of the StringBuffer class returns the current capacity of the buffer.
	 *  The default capacity of the buffer is 16. If the number of character increases from its current
	 *   capacity, it increases the capacity by (oldcapacity*2)
	 *  +2. For example if your current capacity is 16, it will be (16*2)+2=34.
	 */
	
	System.out.println(s.capacity());
}
}
