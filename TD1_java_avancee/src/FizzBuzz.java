public class FizzBuzz {
	public static String fizzBuzz(int i) {
		String res = "0";
		if (i != 0) {
			if ( i % 3 == 0 && i % 5 == 0)
				res = "FizzBuzz";
			else if (i % 3 == 0)
				res = "Fizz";
			else if (i % 5 == 0)
				res = "Buzz";	 
			else 
				return Integer.toString(i);
		}
		return res;
	}
}
