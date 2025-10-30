import java.util.Scanner;

public class Jobsheet8Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int jumlah = 0;
            System.out.print("\nN =" + i + "-> jumlah kuadrat =");

            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = " + jumlah);
        }
    }
}
