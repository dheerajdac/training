
public class EmployeeNotFoundException extends Exception {
	String s;
	public EmployeeNotFoundException() {
		s="Employee Not Found. Try with correct employee id ";
	}
	public String toString(){
		return s;
	}
}
