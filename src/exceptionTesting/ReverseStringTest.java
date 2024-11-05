package exceptionTesting;

import org.testng.annotations.Test;

public class ReverseStringTest {
  @Test(expectedExceptions = NullPointerException.class)
  public void reverseStringTest() {
	  ReverseString s = new ReverseString();
	  s.reverse(null);
	  
  }
}
