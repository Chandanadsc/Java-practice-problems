package ppt;

 class Outer {
int x=15;
 class Inner{
	int y=16;
	
}
}
 class classMyMain{
	public static void main(String[] args)
	{
		Outer myOuter=new Outer();
		Outer.Inner myInner =myOuter.new Inner();
		System.out.println(myInner.y+myOuter.x);
	}
}
