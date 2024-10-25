import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Masukkan sebuah bilangan bulat: ");
            int val = scan.nextInt();

            try {
                System.out.println("Faktorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println("Kesalahan: " + e.getMessage());
            }

            System.out.print("Faktorial lain? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
