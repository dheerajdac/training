package set;

public class PermanentEmployee extends Employee{
	static int permanentEmployeeCounter=0;
	{
		permanentEmployeeCounter++;
	}
	public PermanentEmployee(String firstName, String lastName, int salary, String grade, Date date) {
		super(firstName, lastName, salary, grade, date);
	}
	
	@Override
	void display() {
		System.out.println(getFirstName()+ '\t'+ getLastName() + '\t' + getSalary());	
	}

}
