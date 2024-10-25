import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // Mendapatkan kalimat dari pengguna
        System.out.print("Masukkan sebuah kalimat (hanya huruf, silakan): ");
        String input = scan.nextLine();

        // Mengonversi ke huruf besar
        String word = input.toUpperCase();

        // Menghitung frekuensi setiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try {
                char currentChar = word.charAt(i);
                if (Character.isLetter(currentChar)) {
                    counts[currentChar - 'A']++;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bukan huruf: " + word.charAt(i));
            }
        }

        // Mencetak frekuensi
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
