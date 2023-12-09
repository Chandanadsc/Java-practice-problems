

public class StudentforException {
  int id;
  String name;
  StudentforException(int id,String name) throws InvalidIDException, InvalidNameException
  {
	  if(id<=0)
	  {
		  throw new InvalidIDException("Id cannot be -ve");
	  }
	  else
	  {
		  this.id=id;
	  }
	  if(!name.matches("[a-zA-Z]+"))
	  {
		  throw new InvalidNameException("Name cannot have special symbols");
		    
	  }
	  else
	  {
		  this.name=name;
	  }
	  
  }
}
