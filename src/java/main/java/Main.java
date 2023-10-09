import exceptions.CalculatorException;

import java.util.Scanner;

import static util.Util.checkInput;
import static util.Util.readInput;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String inputValue = readInput(scanner);
            System.out.print(calc(inputValue));
        } catch (IllegalArgumentException e) {
            System.out.printf("Неверный результат: %s", e.getMessage());
        }
    }
    public static String calc(String input) {
        checkInput(input);
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
