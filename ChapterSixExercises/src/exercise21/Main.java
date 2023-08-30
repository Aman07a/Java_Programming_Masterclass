package exercise21;

public class Main {
    public static void main(String[] args) {
        FactorPrinter.printFactors(6);
        // Output: 1
        //         2
        //         3
        //         6

        FactorPrinter.printFactors(32);
        // Output: 1
        //         2
        //         4
        //         8
        //         16
        //         32

        FactorPrinter.printFactors(10);
        // Output: 1
        //         2
        //         5
        //         10

        FactorPrinter.printFactors(-1);
        // Output: Invalid Value
    }
}

