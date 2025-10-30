import java.util.Scanner;

public class Jobsheet8Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik: ");
        int jumlahPoltek = sc.nextInt();
        sc.nextLine();

        for (int p = 1; p <= jumlahPoltek; p++) {
            System.out.println("\nPoliteknik ke-" + p);

            System.out.println("Cabang: Badminton");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + ": ");
                String nama = sc.nextLine();
            }
            System.out.println("Cabang: Tenis Meja");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + ": ");
                String nama = sc.nextLine();
            }
            System.out.println("Cabang: Basket");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + ": ");
                String nama = sc.nextLine();
            }
            System.out.println("Cabang: Bola Voli");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + ": ");
                String nama = sc.nextLine();
            }
        }
        System.out.println("\nData semua atlet berhasil di masukkan!");
        sc.close();
    }
}
