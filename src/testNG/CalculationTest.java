package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest {
	
	 @Test
	    public void testFindMax() {
	        int[] arr = {1, 3, 4, 2, 5, 6};
	        int result = Calculation.findMax(arr);
	        Assert.assertEquals(result, 6, "max = 6");
	    }
	 
	 
	 @Test
	    public void testCube() {
	        int result = Calculation.cube(3);
	        Assert.assertEquals(result, 27, "cube = 27");
	    }
	 
  
	 @Test
	    public void testToThePowerOf() {
	        int result = Calculation.toThePowerOf(2,4);
	        Assert.assertEquals(result, 16, "2 to the power 4 = 16");
	    }
  
	 
	 @Test
	    public void testReverseWord() {
	        String result = Calculation.reverseWord("jonas");
	        Assert.assertEquals(result, "sanoj");
	    }
}
