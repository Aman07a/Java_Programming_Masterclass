package exercise17;

public class Main {
    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(1, 100));     // Output: 2500
        System.out.println(SumOddRange.sumOdd(-1, 100));    // Output: -1
        System.out.println(SumOddRange.sumOdd(100, 100));   // Output: 0
        System.out.println(SumOddRange.sumOdd(13, 13));     // Output: 13
        System.out.println(SumOddRange.sumOdd(100, -100));  // Output: -1
        System.out.println(SumOddRange.sumOdd(100, 1000));  // Output: 247500
    }
}
