package week4;

public class Hospital {
	/*
	 * You have been approached by a client who owns a hospital to develop a program which creates an outer 
class Hospital having data fields hospitalName, hospitalAddr, and gethospitalName() method and an inner 
class Doctor having data field docName, and setdocAddr(), getdocAddr() methods and access outer class 
members with inner class by ’this’ keyword. create Demo class to complete the rest of the program
	 */
private String hospitalName;
private String  address;
public Hospital(String hospitalName2, String drAddress) {
	this.hospitalName=hospitalName2;
	this.address=drAddress;
	// TODO Auto-generated constructor stub
}
public String getHospitalName() {
	return hospitalName;
}
public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
