import static java.lang.Double.sum;

public class CalcManager {
    private int n;
    private double x;

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int cube(int n) {
        n = n * n * n;
        return n;
    }

    /*public static double add(double...x) {
        x = sum(x);
        return x;
    }*/


}
