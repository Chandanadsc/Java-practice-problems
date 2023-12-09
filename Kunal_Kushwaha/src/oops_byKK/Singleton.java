package oops_byKK;
// can create only one object
public class Singleton {
   // Should not allow anyone to call the constructor
	private Singleton() {
		
	}
	private static Singleton instance;
	
	// create a function that will give you the instance
    public static  Singleton getInstance() {
    	// check whether only one instance is created or not
    	if(instance == null) {
    		instance =new Singleton();
    	}
    	return instance;
    }
}
