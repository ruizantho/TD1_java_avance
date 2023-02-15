import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzbuzz {
	@Test
	void TestFizzbuzz0() {
		assertEquals("0", FizzBuzz.fizzBuzz(0));
	}
	@Test
	void TestFizzbuzz1() {
		assertEquals("1", FizzBuzz.fizzBuzz(1));
	}
	@Test
	void TestFizzbuzz2() {
		assertEquals("2", FizzBuzz.fizzBuzz(2));
	}
	@Test
	void TestFizzbuzz3() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
	}
	@Test
	void TestFizzbuzz5() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
	}
	@Test
	void TestFizzbuzz10() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
	}
	@Test
	void TestFizzbuzz15() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
	}
	@Test
	void TestFizzbuzz30() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
	}
}
