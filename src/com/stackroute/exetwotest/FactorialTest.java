package com.stackroute.exetwotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exetwo.Factorial;

class FactorialTest {

	Factorial obj = new Factorial();
	int check;
	@Test
	void test() {
		check = obj.func(Integer.MAX_VALUE);
		assertEquals(13,check);
	}
	

}
