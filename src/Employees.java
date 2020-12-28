
public class Employees {

	String[] emailIds;
	
	int nextIndex = 0;
	int numEmployees = 0;
	
	
	public Employees(int numEmployees) {
		this.numEmployees = numEmployees;
		this.emailIds = new String[numEmployees];
	}
	
	public void addEmployee(String emailId) {
		this.emailIds[this.nextIndex] = emailId;
		this.nextIndex++;
		if(this.nextIndex >= this.numEmployees) {
			this.nextIndex = 0;
		}
	}
	
	public void printEmployees() {
		for(int j=0; j<this.emailIds.length; j++) {
			if(null == this.emailIds[j])
				continue;
			
			System.out.println((j+1) + ": " + this.emailIds[j]);
		}
	}
}
