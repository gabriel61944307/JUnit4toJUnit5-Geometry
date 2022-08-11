package objects;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class PointTest  {

  Point p1, p2;
	
  @Before
  public void initializePoints() {
    p1 = new Point();
    p2 = new Point();
  }

  @Test 
  public void distanceBetweenPoints() {
    p1.setPoint(0, 0);
    p2.setPoint(0, 5);
    assertEquals(5, p1.distance(p2), 0f);
  }
	
  @Test
  public void distanceSamePoint() {
    p1.setPoint(0, 0);
    assertEquals(0, p1.distance(p1), 0f);
   }
  
  @Test(expected= NullPointerException.class)
  public void testNull() {
    Point p3 = null;
    try {    
      assertEquals(0, p1.distance(p3), 0f);
    }
    catch(NullPointerException e) {
      throw e;
    }
    fail("should not get here...");
  }
  
  @Test
  public void testAbc() {
	  try {
		p1.abc();
	} catch (Exception e) {
		//e.printStackTrace();
		if (!( e instanceof NullPointerException )) {	
			fail("excecao incorreta lancada");
		}
	}
  }
  
//  @Test(expected= NullPointerException.class)
//  public void testNull() {
//    Point p3 = null;
//    try {    
//      assertEquals(0, p1.distance(p3), 0f);
//    }
//    catch(NullPointerException e) {
//      throw e;
//    }
//    fail("should not get here...");
//  }
  
}// fim da classe
