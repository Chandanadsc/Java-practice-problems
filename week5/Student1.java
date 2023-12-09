package week5;

class Student1 {
private String ID;
private String name;
private String gender;
private String branch;


public Student1() {
	// TODO Auto-generated constructor stub
}

public String getID() {
    return ID;
}

public void setID(String ID) {
    if (ID.length() == 9 && ID.matches("\\d+")) {
        this.ID = ID;
    } else {
        System.out.println("Invalid ID");
    }
}

public String getName() {
    return name;
}

public void setName(String name) {
    if (name.matches("[a-zA-Z]+")) {
        this.name = name;
    } else {
        System.out.println("Invalid name");
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
