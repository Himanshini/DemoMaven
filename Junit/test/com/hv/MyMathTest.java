package com.hv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

//import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1numbers() {
		System.out.println("Test2");
		assertEquals(3,myMath.sum(new int[] {3}));
	}
}
