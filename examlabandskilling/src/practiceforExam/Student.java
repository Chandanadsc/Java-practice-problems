package practiceforExam;

public class Student {
	
	private String ID;
	private String name;
	private String gender;
	private String branch;


	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getID() {
	    return ID;
	}

	public void setID(String ID)throws InvalidId {
	    if (ID.length() == 9 && ID.matches("\\d+")) {
	        this.ID = ID;
	    } else {
	    	throw new InvalidId();
	       
	    }
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) throws InvalidNameException {
	    if (name.matches("[a-zA-Z]+")) {
	        this.name = name;
	    } else {
	    	throw new InvalidNameException();
	        
	    }
	}

	public String getGender() {
	    return gender;
	}

	public void setGender(String gender) {
	    if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
	        this.gender = gender;
	    } else {
	        System.out.println("Invalid gender");
	    }
	}

	public String getBranch() {
	    return branch;
	}

	public void setBranch(String branch) {
	    if (branch.equalsIgnoreCase("ECE") || branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("ME") ||
	            branch.equalsIgnoreCase("ECSE") || branch.equalsIgnoreCase("CE") || branch.equalsIgnoreCase("BT") ||
	            branch.equalsIgnoreCase("EEE")) {
	        this.branch = branch;
	    } else {
	        System.out.println("Invalid branch");
	    }
	}

	@Override
	public String toString() {
	    return "ID: " + ID + ", Name: " + name + ", Gender: " + gender + ", Branch: " + branch;
	}
	
}
