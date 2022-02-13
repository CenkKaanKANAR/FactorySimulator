
public class Factory {
	// Cenk Kaan Kanar - 150117021
	private String name;
	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls;
	private  double itemPrice;
	
	public Factory() {
		
	}
	
	public Factory(String name, int capacity, double itemPrice) {
		this.name = name;
		this.itemPrice = itemPrice;
		this.storage = new Storage(capacity);
	}
	
	public double getRevenue() {
		
	  return this.storage.getItems().length * this.itemPrice;
	
	}
	
	public double getPaidSalaries() {
		
		int len = this.payrolls.length;
		double paidSalaries = 0;
		
		for ( int i = 0; i < len; i++) {
			paidSalaries += this.payrolls[i].calculateSalary();
		}
	  
	  return paidSalaries;
	
	}
	
	public void addEmployee(Employee employee) {
		
		int len = 0;
		Employee[] employeesTemp; // in order to resize the array use an temporary array with type Employee.
		Item items[] = employee.startShift();
		
		
		if( this.employees == null) {
			
			this.employees = new Employee [1];
			this.employees[0] = employee;
			int arrayLen =  items.length;
			for ( int i = 0; i < arrayLen; i++) { // create first employee and add his/her items to the storage.
				
				this.storage.addItem(items[i]);
			
			}
			
			
		}
		else {
			len = this.employees.length; 
			len++;								// create other employees and add their items to the storage.
			employeesTemp = new Employee[len];
			
			for ( int i = 0; i < employeesTemp.length; i++ ) {
				
				if ( i != employeesTemp.length-1 ) 
					employeesTemp[i] = this.employees[i];
				else
					employeesTemp[i] = employee;
				
			}
			
			this.employees = new Employee[len];
			
			for ( int j = 0; j < this.employees.length; j++ ) {
				
				this.employees[j] = employeesTemp[j];
				
			}
			
			int arrLen = items.length;
			
			for ( int k = 0; k < arrLen; k++) { 
				this.storage.addItem(items[k]);
			}
		}//else

		
	}//method
	
	
	
	public Employee removeEmployee (int id) {
	
		
		Employee removedEmployee;
		Employee[] employeesTemp;
		int len = 0;
		
		
		if(this.employees == null) {
			System.out.println("There are no employees!");
			removedEmployee = new Employee();
			return removedEmployee;
		}
		else if (this.employees != null) {
			
			int i = 0;
			len = this.employees.length;
			
			
			while(i < len) {
				
				if(this.employees[i].getId() == id) {
					removedEmployee = this.employees[i];
					len--;
				
					employeesTemp = new Employee[len];
				
					if(i == 0) {
						
						for ( int j = 0; j < len; j++) {
						employeesTemp[j] = this.employees[j+1]; 
						}
					
					}
					else if( i == this.employees.length-1) {
						
						for ( int k = 0; k < len; k++ ) {
						employeesTemp[k] = this.employees[k];
						}
					
					}
					else if ( i != 0 && i != this.employees.length-1 ) {
						
						for ( int t = 0; t < i; t++ ) {
							employeesTemp[t] = this.employees[t];
					
						}
						
						for ( int z = i+1; z < len+1; z++ ) {
							employeesTemp[z-1] = this.employees[z];
					
						}
					}
			
					
					this.employees = new Employee[len];
				
					for ( int n = 0; n < len; n++ ) {
						this.employees[n] = employeesTemp[n];
					}
				
				
					addPayroll(removedEmployee.endShift());
					return removedEmployee;
				
				}
			
				i++;
			}
		}
		
			removedEmployee = new Employee();
			System.out.println("Employee does not exist!");
			return removedEmployee;
		

	}
	
	
	
	
	private void addPayroll(Payroll payroll) {
		
		int len = 0;
		Payroll[] payrollsTemp;
	
		
		if (this.payrolls == null) {
			
			this.payrolls = new Payroll[1];
			this.payrolls[0] = payroll;
			
		}
		else {
			len = this.payrolls.length;
			len++;
			payrollsTemp = new Payroll[len];
			
			for ( int i = 0; i < payrollsTemp.length; i++) {
				
				if ( i != payrollsTemp.length-1  )
					payrollsTemp[i] = this.payrolls[i];
				else 
					payrollsTemp[i] = payroll;
				
			}
			
			this.payrolls = new Payroll[len];
			
			for ( int j = 0; j < this.payrolls.length; j++) {
				this.payrolls[j] = payrollsTemp[j];
			}
			
		}
			
	}

	
}//class
