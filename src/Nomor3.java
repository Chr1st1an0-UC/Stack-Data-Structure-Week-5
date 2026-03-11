import java.util.Scanner;

public class ChronoStackEngine {

    public static String buildNumber(int target) {
        StringBuilder ops = new StringBuilder();

        int value = 0;

        while (value < target) {

            if (value == 0) {
                ops.append("1");
                value = 1;
            }
            else if ((2 * value + 13) <= target) {
                ops.append("d+");
                value = 2 * value + 13;
            }
            else {
                ops.append("1+");
                value = value + 1;
            }

        }

        return ops.toString();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        System.out.println("Masukkan angka-angkanya:");

        for (int i = 0; i < n; i++) {
            angka[i] = input.nextInt();
        }

        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < n; i++) {
            hasil.append(buildNumber(angka[i]));
        }

        System.out.println("Instruksi Chrono Stack:");
        System.out.println(hasil.toString());
    }
}