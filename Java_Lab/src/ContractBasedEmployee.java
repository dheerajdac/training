
public class ContractBasedEmployee extends Employee{

	private int totalHours,ratePerHour;
	String contractor;
	public static int totalContractBasedEmployees=0;
	private int salary=0;
	public ContractBasedEmployee(String firstName, String lastName, JoiningMonth month, String grade,String contractor,int totalHours,int ratePerHour) {
		super(firstName, lastName, month, grade);
		this.contractor=contractor;
		this.totalHours=totalHours;
		this.ratePerHour=ratePerHour;
		setSalary(totalHours,ratePerHour);
		totalContractBasedEmployees++;
	}
	
	
	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int totalHours,int ratePerHour) {
		this.salary = totalHours*ratePerHour ;
	}




	public static int getTotalContractBasedEmployees(){
		return totalContractBasedEmployees;
	}
	
	public void showDetails(){
		System.out.println("Employee ID: "+getEmp_id());
		System.out.println("First Name: "+getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("Salary: "+getSalary());
		System.out.println("Grade: "+getGrade());
		System.out.println("Joining Month "+getMonth());
		System.out.println("Contractor Name: "+contractor);
		System.out.println("Total no of hours worked: "+totalHours);
		System.out.println("Rate per hour of work: "+ratePerHour);
	}

}
