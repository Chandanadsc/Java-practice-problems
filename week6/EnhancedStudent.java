package week6;

public class EnhancedStudent extends EnhancedPerson{
	
	// class status (freshman,sophomore, junior, or senior)
		private String status;
		public EnhancedStudent(String name,String address,long phoneno,String email,String status)
		{
			super(name,address,phoneno,email);
			this.status=status;
		}
		
			
		public String toString()
		{
			return super.toString()+" \n status="+this.status;
		}
		
	}


