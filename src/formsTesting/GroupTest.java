package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	
	
  @Test
  public void testAddForm() {
	  Rectangle r = new Rectangle(2,2,2,2);
	  Square s = new Square (2,2,4);
	  Group g = new Group();
	  g.addForm(r);
	  g.addForm(s);
	  Assert.assertEquals(g.getForms().size(), 2);
  }
  
  
  @Test
  public void testcalculateArea() {
	  Rectangle r = new Rectangle(1,2,5,5);
	  Group g = new Group();
	  double result = r.calculateArea();
	  Assert.assertEquals(result, 5*5);
	  
  }
  
  @Test
  public void testcalculateCircumference() {
	  Rectangle r = new Rectangle(1,2,5,5);
	  Group g = new Group();
	  double result = r.calculateCircumference();
	  Assert.assertEquals(result, (5+5)*2);
	  
  }

  @Test
  public void testFindBiggestForm() {
      Rectangle r = new Rectangle(2, 2, 2, 2); 
      Square s = new Square(2, 2, 4);         
      Circle c = new Circle(2, 2, 4);          
      Group g = new Group();
      g.addForm(r);
      g.addForm(s);
      g.addForm(c);
      g.printForms();
      g.findBiggestForm();
      Assert.assertEquals(g.findBiggestForm(), r);
  }

  
  
  
  
}
