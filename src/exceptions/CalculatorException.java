package exceptions;

public enum CalculatorException {
    ILLEGAL_OPERATOR_FORMAT("Неверный формат арифметического оператора, введите один из следующих операторов [ +, -, /, * ]\n"),
    ILLEGAL_INPUT_LENGTH("Строка не является математической операцией. " +
            "Формат математической операции должен быть: два операнда и один оператор (+, -, /, *) введенные через пробел\n"),
    ILLEGAL_OPERAND_VALUE("Вводимые числа должны иметь значения от 1 до 10 включительно\n ");

    private final String message;

    CalculatorException(String message) {
        this.message = message;
    }

    public IllegalArgumentException throwException() {
        throw new IllegalArgumentException(this.message);
    }

    public void throwByCondition(boolean condition) {
        if (condition) {
            throw new IllegalArgumentException(this.message);
        }
    }
}
