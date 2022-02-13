
public class Storage {
	// Cenk Kaan Kanar - 150117021
	private int capacity;
	private Item[] items;
	
	public Storage() {
		
	}

	public Storage(int capacity) {
		
		this.capacity = capacity;
	}
	
	public void addItem(Item item) { //Method for adding item to storage
		
		int len = 0;
		Item[] itemsTemp;
	
		if (this.items == null) { // if there is no item create one and put inside the array.
			
			this.items = new Item[1];
			this.items[0] = item;
			
		}
		
		else {
			len = this.items.length;
			len++;
			itemsTemp = new Item[len];		
			
			for ( int i = 0; i < itemsTemp.length; i++) {
				
				if ( i != itemsTemp.length-1  )
					itemsTemp[i] = this.items[i];
				else 
					itemsTemp[i] = item;
				
			}
			
			this.items = new Item[len];
			
			for ( int j = 0; j < this.items.length; j++) {
				this.items[j] = itemsTemp[j];
			}
	
		}//else

	}// method

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}


	
} // Class

