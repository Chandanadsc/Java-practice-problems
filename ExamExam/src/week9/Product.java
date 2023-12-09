package week9;

public class Product {
private int id;
private String name;
private int quantity;
private double price;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public boolean setQuantity(int quantity) {
	if(quantity>0)
	{
		this.quantity = quantity;
	}
	else 
	{
		this.quantity=0;
		return false;
	}
	return true;
}
public double getPrice() {
	return price;
}
public boolean setPrice(double price) {
	if(price>0)
	{
		this.price = price;
	}
	else 
	{
		this.price=0;
		return false;
	}
	return true;
	
}
public String toString()
{
	return "id="+this.id+"\nname ="+this.name+"\nQuantity"+this.quantity+"\nPrice"+this.price+"\nTotal amount"+this.price*this.quantity;
}
}
