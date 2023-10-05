import java.util.Scanner;

import static calculator.Calculator.calc;
import static util.Util.readInput;

public class CalculatorApp {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String inputValue = readInput(scanner);
            System.out.print(calc(inputValue));
        } catch (IllegalArgumentException e) {
            System.out.printf("Неверный результат: %s", e.getMessage());
        }
    }
}
