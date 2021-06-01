import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;	

public class GradebookTest{
	
	private GradeBook book1, book2;
	
	@Before
	public void setUp(){
		book1 = new GradeBook(5);
	    book2 = new GradeBook(5);
		book1.addScore(15);
		book1.addScore(23);
		book2.addScore(4);
		book2.addScore(11);
	}
	
	@Test
	public void testAddScore() {
		assertTrue(book1.toString().equals("15.0 23.0 0.0 0.0 0.0"));
		assertTrue(book2.toString().equals("4.0 11.0 0.0 0.0 0.0"));
		
		assertEquals(book1.getScoreSize(), 5);
		assertEquals(book2.getScoreSize(), 5);
	}
	
	@Test 
	public void testSum() {
		assertTrue(book1.sum() == 38);
		assertTrue(book2.sum() == 15);
	}
	
	@Test
	public void testMinimum() {
		assertTrue(book1.minimum() == 0.0);
		assertTrue(book1.minimum() == 0.0);
	}
	
	@Test 
	public void testFinalScore() {
		assertTrue(book1.finalScore() == 38.0);
		assertTrue(book2.finalScore() == 15.0);
	}
	
	@Test
	public void testGetScoreSize() {
		assertTrue(book1.getScoreSize() == 5);
		assertTrue(book2.getScoreSize() == 5);
	}
	
	@After
	public void tearDown() {
		book1 = null;
		book2 = null;
	}
	

}
