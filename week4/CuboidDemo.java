package week4;

public class CuboidDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Cuboid c1=new Cuboid ();
Cuboid c2=new Cuboid ();
c1.setLenght(8);
c1.setBreadth(4);
c1.setHeight(7);
c1.toString();
System.out.println("l: "+c1.getLenght()+"b: "+c1.getBreadth()+"h: "+c1.getHeight());
c1.Volume();
c2.setLenght(10);
c2.setBreadth(2);
c2.setHeight(12);

c2.toString();
System.out.println("l: "+c2.getLenght()+"b: "+c2.getBreadth()+"h: "+c2.getHeight());
c2.Volume();

	}

}
