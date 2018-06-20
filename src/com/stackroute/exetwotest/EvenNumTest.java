package com.stackroute.exetwotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.stackroute.exetwo.EvenNum;

public class EvenNumTest {

	EvenNum obj = new EvenNum();
	
	@Test
	public void test() {
		boolean check = obj.isEven(100);
		assertEquals(true,check);
	}

}
