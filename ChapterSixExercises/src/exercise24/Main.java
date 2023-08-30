package exercise24;

public class Main {
    public static void main(String[] args) {
        NumberToWords.numberToWords(123);
        // Output: One
        //         Two
        //         Three

        NumberToWords.numberToWords(1010);
        // Output: One
        //         Zero
        //         One
        //         Zero

        NumberToWords.numberToWords(1000);
        // Output: One
        //         Zero
        //         Zero
        //         Zero

        NumberToWords.numberToWords(-12);
        // Output: Invalid Value
    }
}

