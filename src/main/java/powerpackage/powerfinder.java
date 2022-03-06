package powerpackage;
import Math;
class powerfinder {
    public static int OF(int xyz, int limit) {
//        int p = 1;
//        for (int i = 0; i<limit; i++) {
//            p *= xyz;
//        }
        int p = Math.pow(xyz,limit);
        return p;
    }
}
