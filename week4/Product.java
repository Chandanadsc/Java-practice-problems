package week4;

public class Product {
/*
 * Develop a class Product with private data members id, name, quantity, and price. Develop the setters, 
getters and toSting () for quantity and price. The quantity and price must be positive. If invalid values are 
specified set them to 0 and return false. The toString () must also compute the total amount to be paid and 
return it with other attributes
 */
	private int id;
	private String name;
	private int quantity;
	private int price;
	public Product(int id, String name, int quantity, int price) {
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		// TODO Auto-generated constructor stub
	}
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
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
