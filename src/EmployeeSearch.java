import java.util.Scanner;

public class EmployeeSearch {

	public static void main(String[] args) {
		
		Employees workers = new Employees(5);
		
		workers.addEmployee("joe");
		workers.addEmployee("me@mail.com");
		workers.addEmployee("joey@gmail.com");
		workers.addEmployee("terry@hcl.com");
		workers.addEmployee("susan");
		
		System.out.println("Enter an email ID to search for: ");
		Scanner scan = new Scanner(System.in);
		String query = scan.nextLine();
		
		boolean foundMatch = workers.foundMatch(query);
		if(foundMatch) {
			System.out.println("'" + query + "': is a valid email ID.");
		} else {
			System.out.println("'" + query + "': is NOT a valid email ID.");
		}
	}
	
}
