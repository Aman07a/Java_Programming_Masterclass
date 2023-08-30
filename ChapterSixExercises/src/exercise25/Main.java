package exercise25;

public class Main {
    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(1, 0, 4));  // Output: false
        System.out.println(FlourPacker.canPack(1, 0, 5));  // Output: true
        System.out.println(FlourPacker.canPack(0, 5, 4));  // Output: true
        System.out.println(FlourPacker.canPack(2, 2, 11)); // Output: true
        System.out.println(FlourPacker.canPack(-3, 2, 12));// Output: false
    }
}

