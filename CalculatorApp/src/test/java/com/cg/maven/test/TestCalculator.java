package com.cg.maven.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.demo.Calculator;

public class TestCalculator {
	
	@Test
	public void testAdd(){
		Calculator c1 = new Calculator();
		int res = c1.add(3, 6);
		Assert.assertEquals(9, res);
	}
	
	@Test
	public void testSubtract(){
		Calculator c1 = new Calculator();
		int res = c1.subtract(45, 23);
		Assert.assertEquals(22, res);
	}
	
	@Test
	public void testMultiply(){
		Calculator c1 = new Calculator();
		int res = c1.multiply(3, 6);
		Assert.assertEquals(18, res);
	}
	
	@Test
	public void testDivide(){
		Calculator c1 = new Calculator();
		double res = c1.divide(40, 4);
		Assert.assertEquals(10, res);
	}
}
