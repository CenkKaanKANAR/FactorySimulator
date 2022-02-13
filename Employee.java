
public class Employee {
	// Cenk Kaan Kanar - 150117021
	private int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items;
	private Payroll payroll;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String surname, int workHour, int speed) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.workHour = workHour;
		this.speed = speed;
	}

	public Item[] startShift() { 
		
		int arrSize = this.workHour * this.speed;
		
		this.items = new Item[arrSize];
		int itemId = 0;
		
		for ( int i = 0; i < arrSize; i++) {
			itemId = (int)( 1 + Math.random()*99 ); // create items with id numbers
			Item newItem = new Item(itemId);
			this.items[i] = newItem;
		}
		
	return this.items; 
			
	}
	
	public Payroll endShift() {
		
		int itemCount = workHour * speed; //itemCount keeps the number of items an employee has produced.
		Payroll payroll = new Payroll(this.workHour, itemCount);
		this.payroll = payroll;
		
	return payroll;
		
		
	}
	
	public String toString() {
		
		return "This is the employee with id " + this.id + " speed " + this.speed + ". " + this.payroll.toString();
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	

	
}
