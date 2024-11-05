package exceptionTesting;
public class Parser {

    public int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Value must be a number.");
        }
    }
}
