package exercise25;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalWeight = bigCount * 5 + smallCount;

        if (totalWeight >= goal && smallCount >= goal % 5) {
            return true;
        }

        return false;
    }
}

