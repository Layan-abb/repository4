package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Test_Triangle_Classification {
	Triangle_classification tester=new Triangle_classification();
	
	@Test
	public void weakmethod1() {
		String result = tester.classifyTriangle(3, 3, 3);
		String expected = "equilateral";
		assertEquals(expected,result);
	}
	
	@Test
	public void weakmethod2() {
		String result = tester.classifyTriangle(3, 3, 2);
		String expected = "isosceles";
		assertEquals(expected,result);
	}
	
	/*@Test
	public void weakmethod3() {
		String result = tester.classifyTriangle(4, 4, 6);
		String expected = "Error";
		assertEquals(expected,result);
	}*/	
	@Test
	public void weakmethod4() {
		String result = tester.classifyTriangle(5, 3, 3);
		String expected = "isosceles";
		assertEquals(expected,result);
	}
	
	@Test
	public void weakmethod5() {
		String result = tester.classifyTriangle(5, 6, 5);
		String expected = "isosceles";
		assertEquals(expected,result);
	}
	
	@Test
	public void weakmethod6() {
		String result = tester.classifyTriangle(3, 4, 5);
		String expected = "scalene";
		assertEquals(expected,result);
	}
	
	@Test
	public void weakmethod7() {
		String result = tester.classifyTriangle(10, 3, 2);
		String expected = "nottriangle";
		assertEquals(expected,result);
	}
	
	@Test
	public void weakmethod8() {
		String result = tester.classifyTriangle(3, 10, 4);
		String expected = "nottriangle";
		assertEquals(expected,result);
	}
	
	@Test
	public void weakmethod9() {
		String result = tester.classifyTriangle(3, 2, 10);
		String expected = "nottriangle";
		assertEquals(expected,result);
	}
	
}
