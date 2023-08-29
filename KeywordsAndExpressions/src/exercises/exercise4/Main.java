package exercises.exercise4;

public class Main {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 1));   // true
        System.out.println(BarkingDog.shouldWakeUp(false, 2));  // false
        System.out.println(BarkingDog.shouldWakeUp(true, 8));   // false
        System.out.println(BarkingDog.shouldWakeUp(true, -1));  // false
    }
}

