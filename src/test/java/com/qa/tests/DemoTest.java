package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("Sum ");
		int a=10;
		int b=20;
		AssertJUnit.assertEquals(30, a+b);		
	}
	
	@Test
	public void sub() {
		System.out.println("Sub ");
		int a=10;
		int b=20;
		AssertJUnit.assertEquals(10, b-a);		
	}
	@Test
	public void div() {
		System.out.println("Div ");
		int a=10;
		int b=20;
		AssertJUnit.assertEquals(2, b/a);		
	}
	
	@Test
	public void mul() {
		System.out.println("Mul ");
		int a=10;
		int b=20;
		AssertJUnit.assertEquals(200, a*b);		
	}
	

}
