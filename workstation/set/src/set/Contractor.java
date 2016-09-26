package set;


public class Contractor{
	int contractEmployeeCounter=0;
	String nameOfContractor;
	
	public Contractor(String nameOfContractor) {
		this.nameOfContractor = nameOfContractor;
	}

	public class ContractEmployee extends Employee{	
		{
			contractEmployeeCounter++;
		}
		
		int rate;
		int hours;
	    public ContractEmployee(String firstName, String lastName, String grade, Date date,int rate,int hours) {
			super(firstName, lastName, rate*hours, grade, date);
			this.rate=rate;
			this.hours=hours;
		}
	    
	    @Override
		void display() {
			System.out.println(getFirstName()+ '\t'+ getLastName() + '\t' + getSalary());	
		}
	    
	}
}
