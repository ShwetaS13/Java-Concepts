import java.io.*;

class Employee
{
	String name;
	String dept;
	double salary;
	double tax;
	
	void displayName(String name)
	{
		this.name = name;
		System.out.println("Employee Name: " + this.name);
	}
	
	void displayDept(String dept)
	{
		this.dept = dept;
		System.out.println("Department Name: " + this.dept);
	}
	
	void displaySalary(double salary)
	{
		this.salary = salary;
		System.out.println("Salary: $" + this.salary);
	}
	
	void displayTax(double salary)
	{	
		this.salary = salary;
		if(this.salary <= 15000)
		{
			tax = this.salary * 0.01;
		}
		else if(this.salary <= 40000)
		{
			tax = this.salary * 0.02;
		}
		else
		{
			tax = this.salary * 0.03;
		}
		
		System.out.println("Tax is $" + tax);
	}
}

class EmployeeData
{
	public static void main (String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);
		
		Employee emp1 = new Employee ();
		
		System.out.println("Enter employee name:");
		String name = br.readLine();
		
		System.out.println("Enter department name:");
		String dept = br.readLine();
		
		System.out.println("Enter salary:");
		double salary = Double.parseDouble(br.readLine());
		
		int wish;
		
		do{
		System.out.println("Select one of the options below:");
		System.out.println("1. Display Employee Name");
		System.out.println("2. Display Department Name");
		System.out.println("3. Display Salary");
		System.out.println("4. Display Tax");
		
		System.out.println("Select the option:");
		int option = Integer.parseInt(br.readLine());
		
		switch(option)
		{
			case 1: 
				emp1.displayName(name);
				break;
					
			case 2: 
				emp1.displayDept(dept);
				break;
			
			case 3: 
				emp1.displaySalary(salary);
				break;
					
			case 4: 
				emp1.displayTax(salary);
				break;
			
			default: 
				System.out.println("Select one of the above options");
				break;
			
		}
		
		System.out.println("Do you wish to continue? 1 --> Yes  0 --> No");
		wish = Integer.parseInt(br.readLine());
		}
		while(wish == 1);
		
	}
}