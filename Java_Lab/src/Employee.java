																																
public class Employee {
	private String firstName;
	private String lastName;
	private int salary;
	private String grade;
	public static int id=0;
	private int emp_id;
	private String month;
	
	public Employee(String firstName,String lastName,JoiningMonth month,int salary,String grade){
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		this.grade=grade;
		this.month=month.getJoiningMonth();
		this.emp_id=++id;
	}
	
	
	public Employee(String firstName,String lastName,JoiningMonth month,String grade){
		this.firstName=firstName;
		this.lastName=lastName;
		this.grade=grade;
		this.month=month.getJoiningMonth();
		this.emp_id=++id;
	}

	public String getFirstName() {
		return firstName; 
	}


	public String getLastName() {
		return lastName;
	}


	public int getSalary() {
		return salary;
	}


	public String getGrade() {
		return grade;
	}


	public int getEmp_id() {
		return emp_id;
	}

	public String getMonth() {
		return month;
	}

	
	public void showDetails() throws EmployeeNotFoundException{
		System.out.println("Employee ID: "+getEmp_id());
		System.out.println("First Name: "+getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("Salary: "+getSalary());
		System.out.println("Grade: "+getGrade());
		System.out.println("Joining Month "+getMonth());	
	}
}
