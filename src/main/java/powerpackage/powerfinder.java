package powerpackage;

public class powerfinder {
    public static int OF(int base, int power) {
        int p = 1;
        for (int i = 0; i<power; i++) {
            p *= base;
        }
        return p;
    }
}
