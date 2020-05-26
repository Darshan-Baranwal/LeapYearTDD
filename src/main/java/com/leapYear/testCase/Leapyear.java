package com.leapYear.testCase;

public class Leapyear {

	public boolean isLeapYear(int i) {
		return (i%100 == 0) ? (i%400 == 0) : (i%4==0);
	}
}
