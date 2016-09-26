package set;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class test {
	
	
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
			
			
			Map<Key,PermanentEmployee> entry= new TreeMap<>();
			entry.put(e1.getEmployeeId(), e1);
			entry.put(e2.getEmployeeId(), e2);
			entry.put(e3.getEmployeeId(), e3);
			entry.put(e4.getEmployeeId(), e4);
			entry.put(e5.getEmployeeId(), e5);
			
			Set<Map.Entry<Key,PermanentEmployee>> set = entry.entrySet();
			for(Map.Entry<Key, PermanentEmployee> entry2: set ){
				System.out.println(entry2.getKey());
		}
	}
}
