package kunal;

class mypen{
	String colour;
	String type;
	public void write() {
		System.out.println("write something");
	}
	public void printColour()
	{
		System.out.println(this.colour);
	}
	
}



public class pen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mypen pen1=new mypen();
pen1.colour="blue";
pen1.type="gel";
pen1.write();
pen1.printColour();
mypen pen2=new mypen();
pen2.colour="red";
pen2.type="ballpoint";
pen2.write();
pen2.printColour();
	}

}
