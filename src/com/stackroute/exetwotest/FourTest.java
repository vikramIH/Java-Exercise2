package com.stackroute.exetwotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exetwo.Four;

class FourTest {

	@Test
	public void test() {
		Four obj = new Four();
		boolean x = obj.func(1000);
		assertEquals(false, x);
	}
	
	@Test
	public void test1() {
		Four obj = new Four();
		boolean x = obj.func(64);
		assertEquals(true, x);
	}

}
