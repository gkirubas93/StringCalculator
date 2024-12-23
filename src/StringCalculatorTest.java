import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private final StringCalculator calculator = new StringCalculator();

    @Test
    public void runTest() {
        assertEquals(0, calculator.add(""));
        assertEquals(1, calculator.add("1"));
    }
}