import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(applicationContext);
		ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("config/applicationContext.xml");
		System.out.println(applicationContext2);
	}
}
