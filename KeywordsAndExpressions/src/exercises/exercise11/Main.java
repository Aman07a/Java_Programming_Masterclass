package exercises.exercise11;

public class Main {
    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1, 1, 1); // Output: All numbers are equal
        IntEqualityPrinter.printEqual(1, 1, 2); // Output: Neither all are equal or different
        IntEqualityPrinter.printEqual(-1, -1, -1); // Output: Invalid Value
        IntEqualityPrinter.printEqual(1, 2, 3); // Output: All numbers are different
    }
}

