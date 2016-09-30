import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Key;
import com.flp.ems.util.Validate;

public class EmployeeTest {

	@Test
	public void testEmployeeConstruction() {
		Key key = new Key("dhe-007");
		Department d1 =new Department("department1");
		d1.addProject("d1p1");
		d1.addProject("d1p2");
		d1.addRoles("d1r1");
		d1.addRoles("d1r2");
		Date date= new Date();
		date.getTime();
		Employee e1 = new Employee(key,"dheeraj", "9420026097", "pune", date, date, d1, d1.getProject(0), d1.getRole(0));
	}
	
	
	@Test
	public void testValidateDate(){
		assertEquals(Validate.validateDate("18/01/1994"),true);
	}
	
	
	@Test
	public void testValidateName(){
		assertEquals(Validate.validateName("dheeraj"),true);
	}
	
	@Test
	public void testValidateEmail(){
		assertEquals(Validate.validateEmail("dheraj.@gmail.com"),true);
	}

	@Test
	public void testValidatePhone(){
		assertEquals(Validate.validatePhoneNo("9420026037"),true);
	}

}
