package at.olm.bak.git;

public class Product {
	private String name;
	private float price;
	private int id;
	
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
	public float getPrice() {
		return price;
	}
	
	
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
}
