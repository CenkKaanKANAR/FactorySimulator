
public class Item {
	// Cenk Kaan Kanar - 150117021
	private int id;
	public static int numberOfItems = 0;
	
	public Item(int id) {
		this.id = id;
		numberOfItems++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
