package week9;

public class EngineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e1=new Engine();
try {
	
	e1.setEngineID(56);
	e1.setEngineType("hello");
	e1.setEngineWeight(400);
	e1.setHorsepower(90);

}
catch(IllegalArgumentException e)
{
	System.out.println(e);
}

System.out.println(e1.getEngineID()+"\n"+e1.getEngineType()+"\n"+e1.getEngineWeight()+"\n"+e1.getHorsepower());
	}

}
