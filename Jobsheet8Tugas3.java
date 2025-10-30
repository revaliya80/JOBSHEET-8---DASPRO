import java.util.Scanner;

public class Jobsheet8Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        int totalPelanggan = 0;
        int totalItemTerjual = 0;

        System.out.println("\n INPUT PENJUALAN PERCABANG ");

        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("\nCabang " + cabang);
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("Pelanggan" + pelanggan + "memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem;
            }

            System.out.println("Cabang " + cabang + ": ");
            System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("Item terjual: " + totalItemCabang);

            totalPelanggan += jumlahPelanggan;
            totalItemTerjual += totalItemCabang;
        }
        System.out.println("\n TOTAL SELURUH CABANG");
        System.out.println(" Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItemTerjual + " item");

        sc.close();
    }
}