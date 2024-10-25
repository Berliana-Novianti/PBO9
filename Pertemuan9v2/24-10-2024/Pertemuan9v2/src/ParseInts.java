import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan satu baris teks:");
        String line = scan.nextLine();

        Scanner scanLine = new Scanner(line);
        
        // Memindahkan try-catch ke dalam loop
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) 
            {
                System.out.println("Bukan angka, diabaikan." + e.getMessage());
            }
        }

        System.out.println("Jumlah dari angka-angka dalam baris ini adalah " + sum + ".");
    }
}
