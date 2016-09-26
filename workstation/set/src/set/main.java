package set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import set.Contractor.ContractEmployee;

public class main {

	
	public static void main(String[] args) {
			Date date = new Date(01, 06, 2016);
			PermanentEmployee e1= new PermanentEmployee("dheeraj", "kumar", 50000," ba3", date);
			PermanentEmployee e2= new PermanentEmployee("dheeraj", "kumar", 50000," ba3", date);
			PermanentEmployee e3= new PermanentEmployee("dheeraj", "kumar", 50000," ba3", date);
			PermanentEmployee e4= new PermanentEmployee("dheeraj", "kumar", 50000," ba3", date);
			PermanentEmployee e5= new PermanentEmployee("dheeraj", "kumar", 50000," ba3", date);
			
			Contractor c = new Contractor("abcd");
			Contractor.ContractEmployee c1 = c.new ContractEmployee("amey", "kamat", "ba3", date, 20, 70);
			
			class MyComparator implements Comparable{
				@Override
				public int compareTo(Object o) {
					return 0;
				}
			}
			MyComparator com =new MyComparator();
			
			
			HashMap<Key,PermanentEmployee> entry= new HashMap<>();
			entry.put(e1.getEmployeeId(), e1);
			entry.put(e2.getEmployeeId(), e2);
			entry.put(e3.getEmployeeId(), e3);
			entry.put(e4.getEmployeeId(), e4);
			entry.put(e5.getEmployeeId(), e5);
			
			System.out.println(entry.get(e1.getEmployeeId()).getSalary());
	}

}
