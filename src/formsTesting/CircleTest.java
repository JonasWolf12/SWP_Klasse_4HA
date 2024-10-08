package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CircleTest {
  @Test
  public void testCalculateCircumference() {
	  Circle c = new Circle (1,2,5);
	  double result = c.calculateCircumference();
	  Assert.assertEquals(result, 2*5*Math.PI);
  }
  
  @Test
  public void testCalculateArea() {
	  Circle c = new Circle (1,2,5);
	  double result = c.calculateArea();
	  Assert.assertEquals(result, 5*5*Math.PI);
  }
 
  @Test
  public void testToString() {
	  Circle c = new Circle (1.0,2.0,5.0);
	  String result = c.toString();
	  Assert.assertEquals(result,"Circle (" + 1.0 + "|" + 2.0+ ") with radius = " + 5.0);
  }
  
  
}
