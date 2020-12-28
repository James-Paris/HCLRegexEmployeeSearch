
public class EmployeeSearch {

	public static void main(String[] args) {
		
		Employees workers = new Employees(5);
		
		workers.addEmployee("joe");
		workers.addEmployee("me@mail.com");
		workers.addEmployee("joey@gmail.com");
		workers.addEmployee("terry@hcl.com");
		workers.addEmployee("susan");
		
		workers.printEmployees();
	}
	
}
