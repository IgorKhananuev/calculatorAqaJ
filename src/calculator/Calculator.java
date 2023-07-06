package calculator;

import exceptions.CalculatorException;
import util.Util;

public class Calculator {

    public void calculate(String input) {
        Util.checkInput(input);
        String[] splitInput = input.split(" ");
        char operator = splitInput[1].charAt(0);
        int inputValue1 = Integer.parseInt(splitInput[0]);
        int inputValue2 = Integer.parseInt(splitInput[2]);

        switch (operator) {
            case '+':
                System.out.println(inputValue1 + inputValue2);
                break;
            case '-':
                System.out.println(inputValue1 - inputValue2);
                break;
            case '*':
                System.out.println(inputValue1 * inputValue2);
                break;
            case '/':
                System.out.println(inputValue1 / inputValue2);
                break;
            default:
                CalculatorException.ILLEGAL_OPERATOR_FORMAT.throwException();
        }
    }
}
