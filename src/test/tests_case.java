package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculatot_tests_with_tool.calc;

public class tests_case {
private calc calculator;
int first,sec;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		first=40;
		sec=20;
		calculator=new calc();
	}

	@After
	public void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	public void test_add() {
		first=40;
		sec=20;
		calc add_two=new calc();
		int actual=add_two.add(first, sec);
		assertEquals(60, actual);
		
		
	}
	@Test
	public void test_sub() {
		first=40;
		sec=20;
		calc sub_two=new calc();
		int actual=sub_two.sub(first, sec);
		assertEquals(20, actual);
		
		
	}

	@Test
	public void test_mult() {
		first=10;
		sec=5;
		calc mult_two=new calc();
		int actual=mult_two.mult(first, sec);
		assertEquals(50, actual);
		
		
	}
	@Test(expected=ArithmeticException.class)
	public void test_div() {
		first=12;
		sec=0;
		calc div_two=new calc();
		div_two.div(first, sec);
	
		
		
	}
	
}
