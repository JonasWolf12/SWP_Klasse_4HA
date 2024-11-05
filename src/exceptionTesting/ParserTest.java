package exceptionTesting;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ParserTest {

    @Test
    public void testParseIntValidInput() {
        Parser parser = new Parser();
        int result = parser.parseInt("123");
        assertEquals(result, 123, "Expected 123 but got " + result);
    }
}