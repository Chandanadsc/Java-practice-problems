package week4;

public class Doctor extends Hospital {
private String Drname;
private String DrAddress;
public String getDrAddress() {
	return DrAddress;
}
public Doctor(String hospitalName,String HospitalAddr,String Drname,String DrAddress1)
{
	super(hospitalName,HospitalAddr);
	this.DrAddress=DrAddress1;
	this.Drname=Drname;
}
public void setDrAddress(String drAddress) {
	DrAddress = drAddress;
}
public String getDrname() {
	return Drname;
}
public void setDrname(String drname) {
	Drname = drname;
}

}
