
public class PermanentEmployee extends Employee{
	
	public static int totalPermanentEmployees=0;
	
	public PermanentEmployee(String firstName, String lastName, JoiningMonth month, int salary, String grade) {
		super(firstName, lastName, month, salary, grade);
		totalPermanentEmployees++;
	}

	public static int getTotalPermanentEmployees(){
		return totalPermanentEmployees;
	}

}
