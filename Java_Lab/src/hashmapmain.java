import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapmain {
	
public static void main(String[] args) throws EmployeeNotFoundException {
		
		Employee emp;
		
		HashMap< composite , Employee> hashmap= new HashMap<>();
	
		JoiningMonth jme1=new JoiningMonth("01","08","2016");
	emp=new Employee("Anand","Singh",jme1,60000,"AVP");	
	hashmap.put(new composite(1,"yes"),emp);

	JoiningMonth jme2=new JoiningMonth("01","01","2015");
	emp=new Employee("Peter","Bragmen",jme2,40000,"BA1");
	hashmap.put(new composite(2,"yes"),emp);
	
	JoiningMonth jme3=new JoiningMonth("01","12","2013");
	emp=new Employee("Ruby","Rangwin",jme3,50000,"BA2");
	hashmap.put(new composite(3,"yes"),emp);
	
	JoiningMonth jme4=new JoiningMonth("01","08","2014");
	emp=new Employee("Stud","Rawat",jme4,60000,"BA4");
	hashmap.put(new composite(4,"yes"),emp);
	
	JoiningMonth jme5=new JoiningMonth("01","08","2011");
	emp=new Employee("Sacks","Irony",jme5,90000,"VP");
	hashmap.put(new composite(5,"yes"),emp);
	
	
	Set <HashMap.Entry<composite, Employee> > set= hashmap.entrySet();
	
	
	
	for(HashMap.Entry<composite, Employee> entry:set){
		System.out.println(entry.getKey().getKey());
		entry.getValue().showDetails();
		System.out.println();
	}
	try{
		Employee e=hashmap.get(new composite (3,"yes"));
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
