package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
  @Test
  public void testCalculateCircumference() {
	  Rectangle r = new Rectangle (2,2,4,3);
	  double result = r.calculateCircumference();
	  Assert.assertEquals(result, (4+3)*2);
  }


@Test
public void testCalculateArea() {
	  Rectangle r = new Rectangle (2,2,4,3);
	  double result = r.calculateArea();
	  Assert.assertEquals(result, 4*3);
}
}
