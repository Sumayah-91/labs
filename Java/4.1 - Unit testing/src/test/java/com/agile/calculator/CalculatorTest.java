package com.agile.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void subtractionTest(){
		Calculator calculator = new Calculator();
		int expectedAns = 176;
		assertEquals(expectedAns, calculator.subtract("230,54"));
	}
}
