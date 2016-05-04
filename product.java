package at.olm.bak.git;

public class Product {
	private String name;
	private boolean onStock = true;
	public product(String name) {
		setName(name);
		
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
}
