package exceptionTesting;

public class SquareRoot {

	public double sqrt(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative value: " + value);
        }
        return Math.sqrt(value); 
    }
}
	

