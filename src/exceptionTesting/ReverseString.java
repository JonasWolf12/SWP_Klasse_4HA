package exceptionTesting;

public class ReverseString {
	
		public String reverse(String input) {
	        if (input == null) {
	            throw new NullPointerException("Input ist leer");
	        }
	        return new StringBuilder(input).reverse().toString();
	    }
	}

