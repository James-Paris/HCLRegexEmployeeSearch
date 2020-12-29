import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeSearch {

	public static void main(String[] args) {
		
		Employees workers = new Employees(15);
		
		workers.addEmployee("john@mail.com");
		workers.addEmployee("doe@mail.com");
		workers.addEmployee("sue@mail.com");
		workers.addEmployee("joe@mail.com");
		workers.addEmployee("peter@mail.com");
		workers.addEmployee("george@mail.com");
		workers.addEmployee("larry@mail.com");
		workers.addEmployee("perry@mail.com");
		workers.addEmployee("harry@mail.com");
		workers.addEmployee("jerry@mail.com");
		workers.addEmployee("peter@mail.com");
		workers.addEmployee("ryan@mail.com");
		workers.addEmployee("doug@mail.com");
		
		System.out.println("Enter an email ID to search for: ");
		Scanner scan = new Scanner(System.in);
		String query = scan.nextLine();
		
		//regex pattern
		
		Pattern emailMatch = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher emailMatcher = emailMatch.matcher(query);	
		if(!emailMatcher.find()) {
			//informs user why they are not getting any results.
			System.out.println("You did not enter a valid email. Please use @mail.com as your suffix of your search.");
		}
		
		
		boolean foundMatch = workers.foundMatch(query);
		if(foundMatch) {
			System.out.println("'" + query + "': is a valid email ID.");
		} else {
			System.out.println("'" + query + "': is NOT a valid email ID.");
		}
		
		
	}
	
}
