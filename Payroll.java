
public class Payroll {
	// Cenk Kaan Kanar - 150117021
	private int workHour;	
	private int itemCount;
	
	public Payroll() {
		//Default constructor
	}
	
	public Payroll(int workHour, int itemCount) {
		this.workHour = workHour;
		this.itemCount = itemCount;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public int calculateSalary() {
		return this.workHour * 3 + this.itemCount *2;
	}

	@Override
	public String toString() {
		return "The work hour is " + this.workHour + " and the produced item count is " + this.itemCount + ".";
	}
	
}
