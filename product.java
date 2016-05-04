package at.olm.bak.git;

public class Product {
	private String name;
	private float price;
	
	public product(String name, float price) {
		setName(name);
		setPrice(price);
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	
	
	public void setPrice(String price) {
		this.price = price;
	}
}
