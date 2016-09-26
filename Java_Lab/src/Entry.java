import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Entry {
	public static void main(String[] args) throws EmployeeNotFoundException {
		
		Employee emp;
		Map <composite, Employee> map = new TreeMap<>();
		
		
		JoiningMonth jme1=new JoiningMonth("01","08","2016");
		emp=new Employee("Anand","Singh",jme1,60000,"AVP");	
		map.put(new composite(1,"yes"),emp);
	
		JoiningMonth jme2=new JoiningMonth("01","01","2015");
		emp=new Employee("Peter","Bragmen",jme2,40000,"BA1");
		map.put(new composite(2,"yes"),emp);
		
		JoiningMonth jme3=new JoiningMonth("01","12","2013");
		emp=new Employee("Ruby","Rangwin",jme3,50000,"BA2");
		map.put(new composite(3,"yes"),emp);
		
		JoiningMonth jme4=new JoiningMonth("01","08","2014");
		emp=new Employee("Stud","Rawat",jme4,60000,"BA4");
		map.put(new composite(4,"yes"),emp);
		
		JoiningMonth jme5=new JoiningMonth("01","08","2011");
		emp=new Employee("Sacks","Irony",jme5,90000,"VP");
		map.put(new composite(5,"yes"),emp);
		
		Set <Map.Entry<composite, Employee> > set= map.entrySet();
		
		
		for(Map.Entry<composite, Employee> entry:set){
			System.out.println(entry.getKey().getKey());
			entry.getValue().showDetails();
			System.out.println();
		}
		try{
			Employee e=map.get(new composite (2,"yes"));
			e.showDetails();
		}
		catch(NullPointerException npe){
			throw new EmployeeNotFoundException();
		}
		finally{
			System.out.println("This statement must be printed ");
		}
}
}
