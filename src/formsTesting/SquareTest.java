package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
	
	
	@Test
	public void testCalculateArea() {
		  Square s = new Square (2,2,4);
		  double result = s.calculateArea();
		  Assert.assertEquals(result, 4*4);
	}
	
	
	@Test
	public void testCalculateCircumference() {
		  Square s = new Square (2,2,4);
		  double result = s.calculateCircumference();
		  Assert.assertEquals(result, 4*4);
	}
	
	
	@Test
	public void testToString() {
		  Square s = new Square (1,2,3);
		  String result = s.toString();
		  Assert.assertEquals(result, "Square (" + 1.0 + "|" + 2.0 + ") with width = "
					+ 3.0 );
	}
}