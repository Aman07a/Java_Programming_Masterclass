package exercises.exercise10;

public class Main {
    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);  // Output: 525600 min = 1 y and 0 d
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200); // Output: 1051200 min = 2 y and 0 d
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);  // Output: 561600 min = 1 y and 25 d
        MinutesToYearsDaysCalculator.printYearsAndDays(-561600); // Output: Invalid Value
    }
}

