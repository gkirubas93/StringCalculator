import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private final StringCalculator calculator = new StringCalculator();

    @Test
    public void runTest() {
        assertEquals(0, calculator.add(""));
        assertEquals(1, calculator.add("1"));
        assertEquals(3, calculator.add("1,2"));
        assertEquals(15, calculator.add("1,2,3,4,5"));
        assertEquals(6, calculator.add("1\n2,3"));
    }
}