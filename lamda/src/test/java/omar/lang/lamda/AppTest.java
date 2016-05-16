import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void testSayHello() {
		App app = new App();
		assertTrue("", "Hello!".equals(app.sayHello()));
	}

}