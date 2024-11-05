package exceptionTesting;

import org.testng.annotations.Test;

public class SquareRootTest {
	
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSquareRoot() {
	  SquareRoot square = new SquareRoot();
	  square.sqrt(-2);

  }
}
