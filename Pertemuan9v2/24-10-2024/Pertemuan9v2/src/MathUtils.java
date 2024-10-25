public class MathUtils {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial tidak didefinisikan untuk angka negatif: " + n);
        }
        if (n > 16) {
            throw new IllegalArgumentException("Factorial hanya didefinisikan untuk angka sampai 16: " + n);
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
