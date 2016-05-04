package at.olm.bak.git;

public class Product {
	private String name;
<<<<<<< HEAD
	
	public product(String name) {
		setName(name);
		
=======
	private float price;
	private int id;
	
	public product(String name, float price) {
		setName(name);
		setPrice(price);
>>>>>>> origin/master
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
