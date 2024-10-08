package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import testNG.MyMath;

public class CircleTest {
  @Test
  public void testCalculateCircumference() {
	  Circle c = new Circle (1,2,5);
	  double result = c.calculateCircumference();
	  Assert.assertEquals(result, 50);
  }
  
  @Test
  public void testCalculateArea() {
	  Circle c = new Circle (1,2,5);
	  double result = c.calculateArea();
	  Assert.assertEquals(result, 50);
  }
 
  @Test
  public void testToString() {
	  Circle c = new Circle (0,0,0);
	  String result = c.toString();
	  Assert.assertEquals(result, 50);
  }
  
  
}
