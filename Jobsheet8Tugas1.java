import java.util.Scanner;

public class Jobsheet8Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N (minimal 3): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();

        for (int i = 1; i <= N - 2; i++) {
            System.out.print(N + " ");
            for (int j = 1; j <= N - 2; j++) {
                System.out.print("  ");
            }
            System.out.println(N + " ");
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
    }
}
