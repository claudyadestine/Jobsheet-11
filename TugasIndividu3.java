import java.util.Scanner;

public class TugasIndividu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("N harus minimal 3");
        } else {
            // Mencetak baris pertama dengan angka N
            for (int i = 0; i < N; i++) {
                System.out.print(N+" ");
            }
            System.out.println();

            // Mencetak bagian tengah persegi
            for (int i = 1; i < N - 1; i++) {
                // Mencetak angka N di awal baris
                System.out.print(N+" ");

                // Mencetak spasi di tengah baris
                for (int j = 1; j < N - 1; j++) {
                    System.out.print("  ");
                }

                // Mencetak angka N di akhir baris
                System.out.println(N+" ");
            }

            // Mencetak baris terakhir dengan angka N
            for (int i = 0; i < N; i++) {
                System.out.print(N+" ");
            }
            System.out.println();
        }
    }
}