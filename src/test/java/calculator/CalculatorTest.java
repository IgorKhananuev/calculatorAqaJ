package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.testng.annotations.Test;


public class CalculatorTest {

    @Test(description = "тест на арифметические операции")
    public void calcTest() {
        assertEquals("2", Calculator.calc("1 + 1"));
        assertEquals("0", Calculator.calc("1 - 1"));
        assertEquals("1", Calculator.calc("1 / 1"));
        assertEquals("4", Calculator.calc("2 * 2"));
    }

    @Test(description = "тест на валидность вводимых значений")
    public void invalidOperationsTest() {
        Class<IllegalArgumentException> expectedException = IllegalArgumentException.class;

        assertThrows(expectedException, () -> Calculator.calc("1 - 1 + 1"));
        assertThrows(expectedException, () -> Calculator.calc("0 - 10"));
        assertThrows(expectedException, () -> Calculator.calc("10 - 0"));
        assertThrows(expectedException, () -> Calculator.calc("1 ? 1"));
        assertThrows(expectedException, () -> Calculator.calc("1 + "));
        assertThrows(expectedException, () -> Calculator.calc("1+1"));
    }
}