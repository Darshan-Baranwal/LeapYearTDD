package com.leapYear.testCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LeapYearTest {
	Leapyear lp = new Leapyear();
	
	@Test
	public void isLeapYear() {
		assertEquals(true, lp.isLeapYear(2020));
	}
	
	@Test
	public void isMilleniumLeapYear() {
		assertEquals(false, lp.isLeapYear(1000));
	}
	
	@Test
	public void is400MultipleMilleniumYearLeapyear() {
		assertEquals(true, lp.isLeapYear(2000));
	}
}
