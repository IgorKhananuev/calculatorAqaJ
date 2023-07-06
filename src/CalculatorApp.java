import calculator.Calculator;
import util.Util;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try (Scanner scanner = new Scanner(System.in)) {
            String inputValue = Util.readInput(scanner);
            calculator.calculate(inputValue);
        } catch (IllegalArgumentException e) {
            System.out.printf("Неверный результат: %s", e.getMessage());
        }
    }
}
