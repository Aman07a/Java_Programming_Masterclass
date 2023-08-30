package exercise20;

public class Main {
    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));   // Output: true
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));   // Output: true
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));   // Output: false

        System.out.println(LastDigitChecker.isValid(10));    // Output: true
        System.out.println(LastDigitChecker.isValid(468));   // Output: true
        System.out.println(LastDigitChecker.isValid(1051));  // Output: false
    }
}

