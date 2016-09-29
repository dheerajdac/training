import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.view.BootClass;

public class EmployeeTest {

	@Test
	public void testEmployeeConstruction() {
		Department d1 =new Department("department1");
		d1.addProject("d1p1");
		d1.addProject("d1p2");
		d1.addRoles("d1r1");
		d1.addRoles("d1r2");
		Date date= new Date();
		date.getTime();
		Employee e1 = new Employee("dheeraj", "9420026097", "pune", date, date, d1, d1.getProject(0), d1.getRole(0));
	}
	
	@Test
	public void testBootClass(){
		BootClass b1 =new BootClass();
	}

}
