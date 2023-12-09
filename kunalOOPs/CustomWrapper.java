package kunalOOPs;

public class CustomWrapper {
	
	//Creating the custom wrapper class  
	 
	private int i;  
	CustomWrapper(){}  
	CustomWrapper(int i){  
	this.i=i;  
	}  
	public int getValue(){  
	return i;  
	}  
	public void setValue(int i){  
	this.i=i;  
	}  
	@Override  
	public String toString() {  
	  return Integer.toString(i);  
	}  
	}  
	//Testing the custom wrapper class  
	
