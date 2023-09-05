package exercise42;

public class Main {
    public static void main(String[] args) {
        int size = 5; // Change this to the desired size of the array

        int[] inputArray = SortedArray.getIntegers(size);
        int[] sortedArray = SortedArray.sortIntegers(inputArray);

        System.out.println("Sorted array in descending order:");
        SortedArray.printArray(sortedArray);
    }
}

