package set;

abstract public class Employee {
	static int counter=0;
	{
		counter++;
	}
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private int salary;
	private String grade;
	private Date date;
	public Employee(String firstName, String lastName, int salary, String grade, Date date) {
		this.employeeId = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.date = date;
	}
	
	public Key getEmployeeId() {
		return new Key(employeeId);
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
	
	public Date getDate() {
		return date;
	}
	
	abstract void display();
}
