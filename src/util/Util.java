package util;

import exceptions.CalculatorException;

import java.util.Scanner;

public final class Util {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 10;

    public static String readInput(Scanner scanner) {
        System.out.println("Введите математическую операцию (введите два операнда и один оператор +, -, /, * через пробел):");
        return scanner.nextLine();
    }

    public static void checkInput(String input) {
        String[] splitInput = input.split(" ");
        CalculatorException.ILLEGAL_INPUT_LENGTH.throwByCondition(splitInput.length != 3);
        int inputValue1 = Integer.parseInt(splitInput[0]);
        int inputValue2 = Integer.parseInt(splitInput[2]);
        CalculatorException.ILLEGAL_OPERAND_VALUE.throwByCondition(inputValue1 > MAX_VALUE ||
                inputValue2 > MAX_VALUE || inputValue1 < MIN_VALUE || inputValue2 < MIN_VALUE);

    }
}
