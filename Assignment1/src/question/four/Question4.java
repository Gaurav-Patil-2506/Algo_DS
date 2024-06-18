package question.four;

public class Question4 {
	
	public static Employee searchBySalary(Employee[] emp, double salary) {
		for(Employee e : emp) {
			if(e.getSalary()== salary)
			return e;
		}
		return null;
	}	

	public static  Employee searchById(Employee[] emp, int empid) {
		for (Employee e : emp) {
			if(e.getEmpid() == empid) {
				return e;				
			}
		}
		return null;
	}
	
	public static Employee searchByName(Employee[] emp, String name) {
		for (Employee e : emp) {
			if(e.getName().equals(name)) {
				return e;
			}
		}		
		return null;		
	}
public static void main(String[] args) {
		
		Employee[]emp = {
				new Employee(1, "Gaurav" , 50000),
				new Employee(2, "Rahul" , 40000),
				new Employee(3, "Saagar", 45000),
				new Employee(4,"Shubham" , 36000),
				new Employee(11,"Yash",50000),
			    new Employee(5,"Ram",90000),
			    new Employee(8,"Sameer",10000),
			    new Employee(6,"Amit",70000),
			    new Employee(7,"Nilesh",60000),
			    new Employee(9,"Amit",1000.00),
			    new Employee(10,"Mayur",10000)
		};
		
		Employee employeeById = searchById(emp,2);
		
		Employee employeeByName = searchByName(emp, "Gaurav");
		
		Employee employeeBySalary = searchBySalary(emp,36000);
	
		if(employeeById != null )
			System.out.println("Search by EmpId: " +employeeById.toString());
		else
			System.out.println("Not Found");
		
        if(employeeByName != null)
		System.out.println("Search by Name: " + employeeByName.toString());
        
        else
        	System.out.println("Not Found");
        
        if(employeeBySalary!= null)        
        	System.out.println("Search by Salary: " +employeeBySalary.toString());
        else
        	System.out.println("Not Found");
    }


}
