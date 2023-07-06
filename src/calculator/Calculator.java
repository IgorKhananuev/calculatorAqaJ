package calculator;

import exceptions.CalculatorException;
import util.Util;

public class Calculator {

    public String calc(String input) {
        Util.checkInput(input);
        String[] splitInput = input.split(" ");
        char operator = splitInput[1].charAt(0);
        int inputValue1 = Integer.parseInt(splitInput[0]);
        int inputValue2 = Integer.parseInt(splitInput[2]);

        return switch (operator) {
            case '+' -> String.valueOf(inputValue1 + inputValue2);
            case '-' -> String.valueOf(inputValue1 - inputValue2);
            case '*' -> String.valueOf(inputValue1 * inputValue2);
            case '/' -> String.valueOf(inputValue1 / inputValue2);
            default -> throw CalculatorException.ILLEGAL_OPERATOR_FORMAT.throwException();
        };
    }
}
