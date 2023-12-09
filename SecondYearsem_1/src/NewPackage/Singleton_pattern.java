package NewPackage;

	class Singleton_pattern{  
		   private static Singleton_pattern obj=new Singleton_pattern();//Early, instance will be created at load time  
		   private Singleton_pattern(){}  
		     
		   public static Singleton_pattern getA(){  
		    return obj;  
		   } 
		}