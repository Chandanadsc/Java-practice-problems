package week4;

public class PetrolPurchase {
/*
 * Create a class named Petrol Purchase to represent information about the petrol you purchase. The class 
should have five instance variables-the station’s location (type String), the type of petrol (type String), the 
quantity (type int), the price per liter(double), the percentage discount(double). Provide accessors and 
mutator methods for instance variables. In addition, provide a method named getPurchase () that calculates 
the net purchase amount
 */
	private String location;
	private String petrolType;
	private int quantity;
	private double priceperlit;
	private double discountper;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPetrolType() {
		return petrolType;
	}
	public void setPetrolType(String petrolType) {
		this.petrolType = petrolType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPriceperlit() {
		return priceperlit;
	}
	public void setPriceperlit(double priceperlit) {
		this.priceperlit = priceperlit;
	}
	public double getDiscountper() {
		return discountper;
	}
	public void setDiscountper(double discountper) {
		this.discountper = discountper;
	}public PetrolPurchase(String loc, String petrol, int lit, double ppl , double discount){
        this.discountper=discount;
        this.quantity=lit;
        this.petrolType=petrol;
        this.location=loc;
        this.priceperlit=ppl;
    }
	public int getPurchase(int lit,int ppl , double discount){
        return (int) ((this.quantity*this.priceperlit)*this.discountper/100);
    }
    @Override
    public String toString(){
        return "Location - "+this.location+" \ntype - "+this.petrolType+" \nCost - "+this.getPurchase(this.quantity, (int) this.priceperlit,this.discountper);
    }
	
	
}
