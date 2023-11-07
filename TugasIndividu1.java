import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("N harus minimal 3");
        } else {
            for (int i = 1; i <= N; i++) {
                // Membuat string kosong untuk menyimpan angka dalam baris ini
                String row = "";
                for (int j = 1; j <= i; j++) {
                    row += j; // Menambahkan angka ke dalam baris
                }

                // Mencetak baris dengan spasi di awal sesuai dengan posisi baris
                for (int k = 0; k < N - i; k++) {
                    System.out.print(" ");
                }
                System.out.println(row);
            }
        }
    }
}