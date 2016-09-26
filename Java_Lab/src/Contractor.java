
public class Contractor {
	private String name;
	Contractor(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public  class CBEmployee extends Employee{
		private String name;
		private int hours,ratePerHour;
		
		
		public CBEmployee(String firstName,String lastName,JoiningMonth month,String grade,int hours,int ratePerHour){
			super(firstName, lastName, month, grade);
			this.hours=hours;
			this.ratePerHour=ratePerHour;
		}
		
		public String getContractorname(){
			return Contractor.this.getName();
		}
	}
}
