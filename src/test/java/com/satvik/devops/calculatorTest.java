package com.satvik.devops;

//import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class calculatorTest {
	@Test
	public void testSum() {
        System.out.println("Addition:");
        Integer x = 15;
        Integer y = 15;
        Integer expResult = 30;
        Integer result = calculator.Add(x, y);
        assertEquals(expResult, result);
//        assertEquals(null, calculator.Add(15, null));
//        assertEquals(null, calculator.Add(null, 15));
//        assertEquals(null, calculator.Add(null, null));
    }
	@Test
	public void testSub() {
        System.out.println("Substraction:");
        Integer x = 15;
        Integer y = 15;
        Integer expResult = 0;
        Integer result = calculator.Sub(x, y);
        assertEquals(expResult, result);
//        assertEquals(null, calculator.Add(15, null));
//        assertEquals(null, calculator.Add(null, 15));
//        assertEquals(null, calculator.Add(null, null));
    }
	@Test
	public void testMul() {
        System.out.println("Multiplication:");
        Integer x = 10;
        Integer y = 15;
        Integer expResult = 150 ;
        Integer result = calculator.Mul(x, y);
        assertEquals(expResult, result);
//        assertEquals(null, calculator.Add(15, null));
//        assertEquals(null, calculator.Add(null, 15));
//        assertEquals(null, calculator.Add(null, null));
    }
	@Test
	public void testDiv() {
        System.out.println("Division:");
        Integer x = 15;
        Integer y = 15;
        Integer expResult = 1 ;
        Integer result = calculator.Div(x, y);
        assertEquals(expResult, result);
//        assertEquals(null, calculator.Add(15, null));
//        assertEquals(null, calculator.Add(null, 15));
//        assertEquals(null, calculator.Add(null, null));
    }
}
