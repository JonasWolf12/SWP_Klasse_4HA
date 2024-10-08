package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMathTest {
	
	
  @Test
  public void testAddition() {
	  MyMath mm = new MyMath();
	  int result = mm.add(3,5);
	  Assert.assertEquals(result, 8);
  }



@Test
public void testSubtraction() {
	  MyMath mm = new MyMath();
	  int result = mm.subtract(10 ,5);
	  Assert.assertEquals(result, 5);
}



@Test
public void testMultiplication() {
	  MyMath mm = new MyMath();
	  int result = mm.multiply(10,5);
	  Assert.assertEquals(result, 50);
}


@Test
public void testDivide() {
	  MyMath mm = new MyMath();
	  double result = mm.divide(9,5);
	  Assert.assertEquals(result, 1);
}
}

